package org.kavus.one.ntt;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Cat extends Animal {
    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("meow","meowing");
    }

    @Override
    public void initLifeExpectancy() {
        lifeExpectancy=11;    }

    public Cat() {
        super();
    }

    public Cat(LocalDate birthDate, String name) {
        super(birthDate, name);
    }
}
