package org.kavus.two.tst;
import org.kavus.one.ntt.*;
import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AF2Tester {
    public static void main(String args[]){
        AnimalFactory
            dogFac= DogFactory.getUniqueInstance(),
            catFac= CatFactory.getUniqueInstance();
        List<Animal> petList=new ArrayList<>();
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2019,8,4),"Medor"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2016,10,18),"Tom"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2018,7,1),"Garfield"));
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2013,11,30),"Droopy"));
        petList.forEach(animal -> System.out.println(animal));
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2019,1,4),"Medor"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2011,7,7),"Félix"));
        petList.add(dogFac.getAnimalInstance(LocalDate.of(2014,12,13),"Bingo"));
        petList.add(catFac.getAnimalInstance(LocalDate.of(2017,2,18),"Jake"));
        System.out.println("PRINTING ANIMALS");
        petList.forEach(animal -> System.out.println(animal));
        System.out.println("END - PRINTING ANIMALS");
    }
}
