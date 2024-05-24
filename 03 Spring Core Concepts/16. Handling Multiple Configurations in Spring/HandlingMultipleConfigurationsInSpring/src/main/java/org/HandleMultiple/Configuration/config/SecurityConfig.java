package org.HandleMultiple.Configuration.config;

import org.HandleMultiple.Configuration.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 1st way ! to scan another package
//@ComponentScan(basePackages = {"another.world"})
public class SecurityConfig {
    @Bean
    public AuthController authController(){
        return new AuthController();
    }
}
