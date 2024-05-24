package org.HandleMultiple.Configuration.config;

import org.HandleMultiple.Configuration.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

// 1st way ! to scan another package
//@ComponentScan(basePackages = {"org.HandleMultiple.Configuration","another.world"})

//it scan all base packages of this package
@ComponentScan(basePackages = {"org.HandleMultiple.Configuration"})
public class AppConfig {
    //bean for cartService
    @Bean("cartService1")
    public CartService cartService(){
        return new CartService();
    }
}
