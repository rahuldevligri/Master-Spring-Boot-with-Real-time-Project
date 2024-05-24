package com.coupling.LooseCoupling;

import com.coupling.LooseCoupling.Animal;

public class Person {
    Animal animal;
    public Person(Animal animal) {
        this.animal = animal;
    }
    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
