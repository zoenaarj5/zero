package org.kavus.one.ntt;

public abstract class Animal {
    protected Verb noiseMaker;
    public Animal() {
        initNoiseMaker();
    }
    public abstract void initNoiseMaker();
    public Animal(String name) {
        this.name = name;
        initNoiseMaker();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;

    public Verb getNoiseMaker() {
        return noiseMaker;
    }

    public void setNoiseMaker(Verb noiseMaker) {
        this.noiseMaker = noiseMaker;
    }
    @Override
    public String toString(){
        return name+" does: "+noiseMaker;
    }
}