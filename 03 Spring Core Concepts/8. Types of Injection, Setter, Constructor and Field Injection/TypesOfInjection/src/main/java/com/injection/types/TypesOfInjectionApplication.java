package com.injection.types;

import Constructor_Injection.Person;
//import Setter_Injection.Person;
//import Field_Injection.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.injection.types","Constructor_Injection"})
//@ComponentScan(basePackages = {"com.injection.types","Setter_Injection"})
//@ComponentScan(basePackages = {"com.injection.types","Field_Injection"})
public class TypesOfInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TypesOfInjectionApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(personBean);
	}
}
