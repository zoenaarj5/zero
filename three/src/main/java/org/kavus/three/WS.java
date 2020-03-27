package org.kavus.three;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@WebService
public class WS {
    private static final AnimalFactory
        dogFac= DogFactory.getUniqueInstance(),
        catFac= CatFactory.getUniqueInstance();
    private static final List<Animal> petList=new ArrayList<>();
    @WebMethod
    public String getLifeExpectancy(String animalName){
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2019,1,4),"Medor"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2011,7,7),"Félix"));
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2014,12,13),"Bingo"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2017,2,18),"Jake"));
        System.out.println("PRINTING ANIMALS");
        petList.forEach(animal -> System.out.println(animal));
        System.out.println("END - PRINTING ANIMALS");
        Object[] res = petList.stream().filter(animal -> animal.getName().toUpperCase().equals(animalName.toUpperCase())).toArray();
        if(res.length>0){
            Animal theOne=(Animal)res[0];
            Period rem=Period.between(LocalDate.now(),theOne.getBirthDate().plus(Period.ofYears(theOne.getLifeExpectancy())));
            return theOne.getName() + " should still live for "+rem.getYears()+" years, "+rem.getMonths()+" months and "+rem.getDays()+" days.";
        }
        return null;
    }
}
