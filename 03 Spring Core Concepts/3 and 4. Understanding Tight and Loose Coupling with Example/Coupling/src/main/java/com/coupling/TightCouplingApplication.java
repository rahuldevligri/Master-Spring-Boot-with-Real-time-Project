package com.coupling;

import com.coupling.LooseCoupling.Animal;
import com.coupling.LooseCoupling.Cat;
//import com.coupling.LooseCoupling.Dog;
//import com.coupling.TightCoupling.Person;
import com.coupling.LooseCoupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCouplingApplication {
	public static void main(String[] args) {
		SpringApplication.run(TightCouplingApplication.class, args);
		//Tight_Coupling.....
		/*
		Person p = new Person();
		p.playWithAnimal();
		 */

		//Loose Coupling...
		//Animal animal = new Dog();
		Animal animal = new Cat();
		Person p = new Person(animal);
		p.playWithAnimal();
	}

}
