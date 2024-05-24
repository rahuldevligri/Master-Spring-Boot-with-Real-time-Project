package Field_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    @Autowired
    Animal animal;

    @Autowired
    Student student;

    //Setter Method not invoke
    public void setAnimal(Animal animal) {
        System.out.println("setting animal...in Setter injection");
        this.animal =  animal;
    }

    public void setStudent(Student student) {
        System.out.println("setting student...in Setter injection");
        this.student = student;
    }

    public void playWithAnimal(){
        animal.play();
        student.detail();
    }
}
