package com.removeBean.conflict;

import com.removeBean.conflict.usingQualifierAnnotation.Animal;
import com.removeBean.conflict.usingQualifierAnnotation.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.removeBean.conflict", "test"})
public class RemoveBeanConflictApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RemoveBeanConflictApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(personBean);

		Test testBean = context.getBean(Test.class);
		testBean.testing();

		//get bean using name wise injection
		Animal cat = context.getBean("cat", Animal.class);
		cat.play();
		Animal dog = context.getBean("dog", Animal.class);
		dog.play();
	}

}
