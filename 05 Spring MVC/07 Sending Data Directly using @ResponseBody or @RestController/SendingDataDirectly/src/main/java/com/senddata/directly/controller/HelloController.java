package com.senddata.directly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String SayHello(){
        return "Hello, I'm Rahul Devligri";
    }
}
