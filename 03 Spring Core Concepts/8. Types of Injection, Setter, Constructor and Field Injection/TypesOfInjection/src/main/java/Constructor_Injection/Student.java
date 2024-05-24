package Constructor_Injection;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Creating student... in constructor injection");
    }

    public void detail(){
        System.out.println("I'm Student Detail...in constructor injection");
    }
}
