package org.springwithout.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springwithout.springboot.beans.CartService;
import org.springwithout.springboot.beans.OrderService;
import org.springwithout.springboot.beans.UserService;
import org.springwithout.springboot.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started..." );
        //we have to create object of application context
        //this is for annotation configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);

       CartService cartService1 = context.getBean("cartService1", CartService.class);
       cartService1.createCart();

        UserService userService = context.getBean(UserService.class);
        userService.saveUser();

        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder();
        //this is for cml based configuration
        //ApplicationContext context = new Attribute.Class();
    }
}
