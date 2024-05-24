package com.proxymode.bean;

import com.proxymode.bean.scope.Pepsi;
import com.proxymode.bean.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanScopeProxyModeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanScopeProxyModeApplication.class, args);

		//get object 1st time
		Pepsi pepsi1 = context.getBean(Pepsi.class);
		System.out.println(pepsi1);
		Soda soda1 = pepsi1.getSoda();
		System.out.println(soda1);

		//get object 2nd time
		Pepsi pepsi2 = context.getBean(Pepsi.class);
		System.out.println(pepsi2);
		Soda soda2 = pepsi2.getSoda();
		System.out.println(soda2);

		//get object 3rd time
		Pepsi pepsi3 = context.getBean(Pepsi.class);
		System.out.println(pepsi3);
		System.out.println(pepsi3.getSoda());

	}
}
