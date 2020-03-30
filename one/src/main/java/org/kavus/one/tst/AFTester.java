package org.kavus.one.tst;

import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AFTester {

    public static void main(String args[]){
        List<Animal> animalList=new ArrayList<>();
        AnimalFactory
                dogFactory=DogFactory.getUniqueInstance(),
                catFactory=CatFactory.getUniqueInstance();
        animalList.add(dogFactory.getAnimalInstance(LocalDate.of(2010,1,8),"Rex"));
        animalList.add(catFactory.getAnimalInstance(LocalDate.of(2018,5,18),"Felix"));
        animalList.add(dogFactory.getAnimalInstance(LocalDate.of(2015,12,19),"Snoopy"));
        animalList.forEach(animal -> System.out.println(animal));
    }
}
