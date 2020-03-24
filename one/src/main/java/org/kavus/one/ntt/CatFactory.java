package org.kavus.one.ntt;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal getAnimalInstance() {
        return new Cat();
    }

    @Override
    public Animal getAnimalInstance(String name) {
        return new Cat(name);
    }
}
