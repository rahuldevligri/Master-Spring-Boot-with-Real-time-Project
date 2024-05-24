package com.coupling.TightCoupling;

public class Person {
    Animal animal = new Animal();
    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
