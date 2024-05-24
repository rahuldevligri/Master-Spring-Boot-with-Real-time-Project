package com.springBootApplication.Actuator.controllers;

import com.springBootApplication.Actuator.config.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private CustomConfig customConfig;
    @Value("${readingData.profile.image.path}")
    private String profilePath;

    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos = Arrays.asList(
                "Learn Java",
                "Learn Spring Boot",
                "Develop Project",
                "Learn code"
        );
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;
    }

    @RequestMapping("/customConfig")
    public CustomConfig getCustomConfig(){
        System.out.println(this.customConfig);
        return this.customConfig;
    }
}
