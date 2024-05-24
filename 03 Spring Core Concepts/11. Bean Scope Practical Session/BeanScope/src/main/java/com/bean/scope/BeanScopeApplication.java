package com.bean.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//import TypeOfScope.singleton.Pepsi;
import TypeOfScope.prototype.Pepsi;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.bean.scope","TypeOfScope.singleton"})
@ComponentScan(basePackages = {"com.bean.scope","TypeOfScope.prototype"})

public class BeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanScopeApplication.class, args);

		//bean scope
		//first request for pepsi bean
		Pepsi bean1 = context.getBean(Pepsi.class);
		bean1.drink();

		System.out.println(bean1);

        //2nd request for pepsi bean
		Pepsi bean2 = context.getBean(Pepsi.class);
		System.out.println(bean2);

		//3rd request for pepsi bean
		Pepsi bean3 = context.getBean(Pepsi.class);
		System.out.println(bean3);
	}

}
