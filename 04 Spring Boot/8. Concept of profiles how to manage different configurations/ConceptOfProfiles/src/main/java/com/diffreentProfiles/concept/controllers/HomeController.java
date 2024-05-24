package com.diffreentProfiles.concept.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
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
}
