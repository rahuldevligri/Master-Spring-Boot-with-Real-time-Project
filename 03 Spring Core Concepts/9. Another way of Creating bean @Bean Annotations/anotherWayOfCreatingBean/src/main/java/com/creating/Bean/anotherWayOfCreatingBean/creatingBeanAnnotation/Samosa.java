package com.creating.Bean.anotherWayOfCreatingBean.creatingBeanAnnotation;
public class Samosa {

    String name;

    public Samosa(String name ){
        System.out.println("this is "+name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Wow samosa is very spicy");
        System.out.println(name);
    }
}
