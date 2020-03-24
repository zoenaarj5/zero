package org.kavus.one.tst;

import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import java.util.ArrayList;
import java.util.List;

public class AFTester {

    public static void main(String args[]){
        List<Animal> animalList=new ArrayList<>();
        AnimalFactory
                dogFactory=DogFactory.getUniqueInstance(),
                catFactory=CatFactory.getUniqueInstance();
        animalList.add(dogFactory.getAnimalInstance("Rex"));
        animalList.add(catFactory.getAnimalInstance("Felix"));
        animalList.add(dogFactory.getAnimalInstance("Snoopy"));
        animalList.forEach(animal -> System.out.println(animal));
    }
}
