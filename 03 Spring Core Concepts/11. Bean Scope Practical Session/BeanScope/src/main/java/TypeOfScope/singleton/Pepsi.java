package TypeOfScope.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//1st way bean scope by default singleton
@Component
@Scope("singleton") // 2nd way we can mainualy define scope of the bean useing @Scope annotation
public class Pepsi {
    public Pepsi(){
        System.out.println("Pepsi Object Created....");
    }

    public void drink(){
        System.out.println("Pepsi is very cool...");
    }
}
