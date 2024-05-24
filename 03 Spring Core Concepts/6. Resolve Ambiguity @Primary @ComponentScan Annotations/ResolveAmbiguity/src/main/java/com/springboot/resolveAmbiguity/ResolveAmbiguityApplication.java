package com.springboot.resolveAmbiguity;

import com.springboot.resolveAmbiguity.usingPrimaryAnnotation.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.resolveAmbiguity","test"})
public class ResolveAmbiguityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ResolveAmbiguityApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(personBean);

		Test testBean = context.getBean(Test.class);
		testBean.testing();
	}

}
