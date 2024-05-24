package com.creating.Bean.anotherWayOfCreatingBean.creatingBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    //filed injection or property injection
    //1st and 2nd -> using @Primary annotation
//    @Autowired
//    Samosa samosa;

    //3rd-> using @Qualifier and put name of bean
    //4th -> making MyConfig class to declare bean on it
    @Autowired
    @Qualifier("samosa1")
    Samosa samosa;

    public void eatingSamosa(){
       samosa.eat();
    }
}
