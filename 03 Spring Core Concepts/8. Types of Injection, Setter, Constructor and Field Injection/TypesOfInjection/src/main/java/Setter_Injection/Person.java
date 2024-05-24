package Setter_Injection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    Animal animal;
    Student student;

    //injection using autowired on setter: animal
    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("setting animal...in Setter injection");
        this.animal = animal;
    }

    //injection using autowired on setter: student
    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting student...in Setter injection");
        this.student = student;
    }

    public void playWithAnimal(){
        //using animal
        animal.play();
        student.detail();
    }
}
