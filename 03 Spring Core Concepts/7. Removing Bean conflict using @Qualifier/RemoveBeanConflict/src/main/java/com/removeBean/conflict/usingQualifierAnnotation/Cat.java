package com.removeBean.conflict.usingQualifierAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("cat")
   // both are same

//@Primary //<- declare bean as a primary
@Component
@Qualifier("cat")
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat is playing...");
    }
}