package org.kavus.four.ws;

import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
@WebService
public class WSDL {
    @WebMethod
    public String getAnimalAge(String animalName){
        final AnimalFactory
                dogFac= DogFactory.getUniqueInstance(),
                catFac= CatFactory.getUniqueInstance();
        final List<Animal> petList=new ArrayList<>();
            petList.add(dogFac.getAnimalInstance(LocalDate.of(2019,1,4),"Medor"));
            petList.add(catFac.getAnimalInstance(LocalDate.of(2011,7,7),"Félix"));
            petList.add(dogFac.getAnimalInstance(LocalDate.of(2014,12,13),"Bingo"));
            petList.add(catFac.getAnimalInstance(LocalDate.of(2007,2,18),"Jake"));
        System.out.println("PRINTING ANIMALS");
        petList.forEach(animal -> System.out.println(animal));
        System.out.println("END - PRINTING ANIMALS");
        Object[] res = petList.stream().filter(animal -> animal.getName().toUpperCase().equals(animalName.toUpperCase())).toArray();
        if(res.length>0){
            Animal theOne=(Animal)(res[0]);
            System.out.println("printing life expectancy"+theOne.getLifeExpectancy());
            Period age=Period.between(theOne.getBirthDate(),LocalDate.now());
            return theOne.getName() + " is "+age.getYears()+" years, "+age.getMonths()+" months and "+age.getDays()+" days-old.";
        }
        return "NOTHING_FOUND";
    }
}
