package com.lifecycle.bean.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Creating Student Object...");
    }

    @PostConstruct
    public void postConstruct(){
        //some initialization
        System.out.println("Student Bean is Created: postConstruct()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Bye bye student bean: postDestroy()");
    }

}
