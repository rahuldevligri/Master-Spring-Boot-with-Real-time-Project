package com.HTTPmethods.Support.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class ByeController {

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    @ResponseBody
    public List<String> byeALl(){
        return Arrays.asList("Bye","Good Night");
    }
}