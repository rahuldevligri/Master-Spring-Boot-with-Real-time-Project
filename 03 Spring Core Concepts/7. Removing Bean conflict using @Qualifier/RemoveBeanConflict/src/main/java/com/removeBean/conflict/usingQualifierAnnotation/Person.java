package com.removeBean.conflict.usingQualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    //setter injection or property injection
    /*
    @Autowired
    @Qualifier("dog")//identifier
    */
    Animal animal;

    //use any one of them

    //Constructor injection -> it will inject object using constructor
    @Autowired
    public Person(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
