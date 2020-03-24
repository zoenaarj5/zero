package org.kavus.one.ntt;

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
    public Animal getAnimalInstance(String name) {
        return new Dog(name);
    }
}
