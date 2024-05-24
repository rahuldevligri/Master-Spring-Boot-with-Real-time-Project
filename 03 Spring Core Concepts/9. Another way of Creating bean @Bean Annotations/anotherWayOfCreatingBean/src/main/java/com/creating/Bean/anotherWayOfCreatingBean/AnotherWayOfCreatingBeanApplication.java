package com.creating.Bean.anotherWayOfCreatingBean;

import com.creating.Bean.anotherWayOfCreatingBean.creatingBeanAnnotation.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AnotherWayOfCreatingBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AnotherWayOfCreatingBeanApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.eatingSamosa();
		System.out.println(personBean);
	}
	//-> declaring the bean using @Bean Annotation

	//1st. way
//	@Bean
//	public Samosa getSamosa()
//	{
//		return new Samosa();
//	}

	//2nd way -> declare @Primary annotation

//	@Bean
//	@Primary
//	public Samosa getSamosa1()
//	{
//		return new Samosa("Tandoori Samosa");
//	}
//
//	@Bean
//	//@Primary
//	public Samosa getSamosa2()
//	{
//		return new Samosa("Meeta Samosa");
//	}

	//3rd way -> we can define name of the bean
//	@Bean(name ="samosa1")
//	public Samosa getSamosa1()
//	{
//		return new Samosa("Tandoori Samosa");
//	}
//
//	@Bean(name ="samosa2")
//	public Samosa getSamosa2()
//	{
//		return new Samosa("Meeta Samosa");
//	}

}
