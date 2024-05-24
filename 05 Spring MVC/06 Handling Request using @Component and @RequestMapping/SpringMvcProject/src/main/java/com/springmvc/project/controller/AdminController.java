package com.springmvc.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") //class level RequestMapping
public class AdminController{
    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return "login";
    }
}
