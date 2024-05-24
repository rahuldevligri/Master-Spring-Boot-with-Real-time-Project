package com.BeensAndDependency.management;

import com.BeensAndDependency.management.BeansAndDependenciesManagementUsingSpring.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"test"})
//@ComponentScan(basePackages = {"test","otherPackage"})
public class BeansAndDependencyManagmentApplication {

	public static void main(String[] args) {
		/*
		1. About the Bean using @Component
		2. About the Dependencies using @Autowired
		3. where to scan for Bean
		   to scan other package we use @ComponentScan(basePackages = {"package1","packageN.."})
		 */
		ApplicationContext context = SpringApplication.run(BeansAndDependencyManagmentApplication.class, args);
		Person personBean = context.getBean(Person.class);
        personBean.playWithAnimal();
	}
}
