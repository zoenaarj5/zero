package org.kavus.one.ntt;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "NOISE_MAKER_ID")
    protected Verb noiseMaker;
    @Transient
    protected int lifeExpectancy;

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Animal() {
        initNoiseMaker();initLifeExpectancy();
    }
    public abstract void initNoiseMaker();
    public Animal(LocalDate birthDate,String name) {
        this.birthDate=birthDate;
        this.name = name;
        initNoiseMaker();
        initLifeExpectancy();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;
    @Column(name="BIRTH_DATE")
    protected LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Verb getNoiseMaker() {
        return noiseMaker;
    }
    public abstract void initLifeExpectancy();
    public void setNoiseMaker(Verb noiseMaker) {
        this.noiseMaker = noiseMaker;
    }
    @Override
    public String toString(){
        return name+", born on "+birthDate+" does: "+noiseMaker;
    }
}