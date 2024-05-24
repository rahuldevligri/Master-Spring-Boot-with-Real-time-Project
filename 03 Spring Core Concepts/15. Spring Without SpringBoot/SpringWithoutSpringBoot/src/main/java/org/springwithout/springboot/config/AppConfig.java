package org.springwithout.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springwithout.springboot.beans.CartService;

@Configuration
@ComponentScan(basePackages = {" org.springwithout.springboot"})
public class AppConfig {
    //bean for cartService
    @Bean("cartService1")
    public CartService cartService(){
        return new CartService();
    }

//    @Bean
//    public ViewResolver viewResolver(){
//        ViewResolver v = new ViewResolver();
//
//        return v;
//    }
}
