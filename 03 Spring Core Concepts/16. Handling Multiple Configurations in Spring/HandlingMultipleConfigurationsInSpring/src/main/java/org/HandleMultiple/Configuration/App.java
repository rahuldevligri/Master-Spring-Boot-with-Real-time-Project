package org.HandleMultiple.Configuration;

import another.world.Repo;
import org.HandleMultiple.Configuration.beans.CartService;
import org.HandleMultiple.Configuration.beans.OrderService;
import org.HandleMultiple.Configuration.beans.UserService;
import org.HandleMultiple.Configuration.config.AppConfig;
import org.HandleMultiple.Configuration.web.AuthController;
import org.HandleMultiple.Configuration.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started..." );
        //we have to create object of application context
        //this is for annotation configuration
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //2nd way to scan another package class just put that class name in it...
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, Repo.class);
        System.out.println(context);

        CartService cartService1 = context.getBean("cartService1", CartService.class);
        cartService1.createCart();

        UserService userService = context.getBean(UserService.class);
        userService.saveUser();

        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder();

        HomeController hc = context.getBean(HomeController.class);
        hc.homePage();

        AuthController ac = context.getBean(AuthController.class);
        ac.login();

        Repo rp = context.getBean(Repo.class);
        rp.getUser();
    }
}
