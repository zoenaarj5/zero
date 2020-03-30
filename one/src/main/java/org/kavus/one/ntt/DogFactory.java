package org.kavus.one.ntt;

import java.time.LocalDate;

public class DogFactory extends AnimalFactory{
    private static DogFactory uniqueInstance=new DogFactory();

    public static DogFactory getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(DogFactory uniqueInstance) {
        DogFactory.uniqueInstance = uniqueInstance;
    }
    private DogFactory(){
        super();
    }
    @Override
    public Animal getAnimalInstance() {
        return new Dog();
    }

    @Override
    public Animal getAnimalInstance(LocalDate birthDate, String name) {
        return new Dog(birthDate,name);
    }
}
