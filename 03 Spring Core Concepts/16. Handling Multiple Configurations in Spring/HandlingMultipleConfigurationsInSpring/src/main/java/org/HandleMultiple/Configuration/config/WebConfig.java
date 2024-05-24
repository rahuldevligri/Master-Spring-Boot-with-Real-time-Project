package org.HandleMultiple.Configuration.config;

import org.HandleMultiple.Configuration.web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//1st way
//@ComponentScan(basePackages = {"another.world"})
public class WebConfig {
    //declare the home controller bean
    @Bean
    public HomeController homeController(){
       return new HomeController();
    }
}
