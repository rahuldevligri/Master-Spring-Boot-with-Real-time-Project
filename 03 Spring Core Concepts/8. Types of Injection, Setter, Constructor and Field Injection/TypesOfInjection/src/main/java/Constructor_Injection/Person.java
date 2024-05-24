package Constructor_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    Animal animal;
    Student student;

    //Constructor based injection -> it will inject object using constructor
    @Autowired
    public Person(Animal animal, Student student) {
        System.out.println("Calling Constructor auto-wiring....in constructor injection");
        this.animal = animal;
        this.student = student;
    }

    public void playWithAnimal(){
        //using animal
        animal.play();
        student.detail();
    }
}
