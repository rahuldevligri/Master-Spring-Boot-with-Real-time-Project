package com.removeBean.conflict.usingQualifierAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// both are same
/*
@Component
@Qualifier("cat")
*/
//@Primary //<- declare bean as a primary
@Component("dog")
public class Dog implements Animal{
    @Override
    public void play(){
        System.out.println("Dog is playing...");
    }
}