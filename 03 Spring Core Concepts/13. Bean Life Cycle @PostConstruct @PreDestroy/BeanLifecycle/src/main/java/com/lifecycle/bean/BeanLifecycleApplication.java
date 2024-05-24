package com.lifecycle.bean;

import com.lifecycle.bean.lifecycle.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanLifecycleApplication.class, args);
	}

}
