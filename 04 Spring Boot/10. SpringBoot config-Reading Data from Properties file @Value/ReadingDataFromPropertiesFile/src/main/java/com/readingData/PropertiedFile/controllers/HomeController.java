package com.readingData.PropertiedFile.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

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
}
