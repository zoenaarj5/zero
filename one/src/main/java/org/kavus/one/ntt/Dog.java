package org.kavus.one.ntt;

public class Dog extends Animal {
    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("bark","barking");
    }

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }
}
