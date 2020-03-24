package org.kavus.two.tst;
import org.kavus.one.*;
import org.kavus.one.ntt.Animal;
import org.kavus.one.ntt.AnimalFactory;
import org.kavus.one.ntt.CatFactory;
import org.kavus.one.ntt.DogFactory;

import java.util.ArrayList;
import java.util.List;

public class AF2Tester {
    public static void main(String args[]){
        AnimalFactory
            dogFac= DogFactory.getUniqueInstance(),
            catFac= CatFactory.getUniqueInstance();
        List<Animal> petList=new ArrayList<>();
    }
}
