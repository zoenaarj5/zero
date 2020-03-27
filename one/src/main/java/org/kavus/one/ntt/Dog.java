package org.kavus.one.ntt;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Dog extends Animal {
    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("bark","barking");
    }

    public Dog() {
        super();
    }

    public Dog(LocalDate birthDate, String name) {
        super(birthDate, name);
    }

    @Override
    public void initLifeExpectancy() {
        lifeExpectancy=13;
    }
}
