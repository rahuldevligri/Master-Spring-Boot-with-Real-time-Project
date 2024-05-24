package com.springmvc.project.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Component
//@RequestMapping
@Controller
public class SuperMan {

    /*
    /about
    @RequestMapping is used for mapping the url with mapping...
     */
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request");
        return "about";
    }
}
