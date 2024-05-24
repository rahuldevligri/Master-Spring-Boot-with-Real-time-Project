package TypeOfScope.prototype;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//1st way bean scope by default singleton
@Component
@Scope("prototype") // 3rd way we can manually define scope of the bean using @Scope annotation
public class Pepsi {
    public Pepsi(){
        System.out.println("Pepsi Object Created....");
    }

    public void drink(){
        System.out.println("Pepsi is very cool...");
    }
}
