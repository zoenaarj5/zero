package org.kavus.one.ntt;

public class CatFactory extends AnimalFactory{
    private static CatFactory uniqueInstance=new CatFactory();

    public static CatFactory getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(CatFactory uniqueInstance) {
        CatFactory.uniqueInstance = uniqueInstance;
    }

    @Override
    public Animal getAnimalInstance() {
        return new Cat();
    }
    private CatFactory(){
        super();
    }
    @Override
    public Animal getAnimalInstance(String name) {
        return new Cat(name);
    }
}
