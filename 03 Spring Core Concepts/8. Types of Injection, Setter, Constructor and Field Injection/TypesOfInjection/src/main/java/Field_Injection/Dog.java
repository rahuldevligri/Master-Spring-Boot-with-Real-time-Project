package Field_Injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //<- declare bean as a primary
public class Dog implements Animal {

    @Override
    public void play()
    {
        System.out.println("Dog is playing...in field injection");
    }
}
