package org.kavus.one.ntt;

public class Cat extends Animal {
    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("meow","meowing");
    }

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }
}
