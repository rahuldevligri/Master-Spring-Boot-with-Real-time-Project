package com.Json.springboot.controllers;

import com.Json.springboot.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class studentController {

    /*
  We are receiving data in JSON format
  JSON --> java obj => deserialization
  java obj --> JSON => serialization
   */
    @PostMapping("/createStudent")         //deserialization
    public Student createStudent(@RequestBody Student student){
        System.out.println(student);

        //store JSON data in variables
        String name = student.getName();
        String email = student.getEmail();
        String phone = student.getPhone();
        String course = student.getCourse();

        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone No.:"+phone);
        System.out.println("Course:"+course);

        return student; //serialization
    }
    @PostMapping("/createStudents")
    public String createStudents(@RequestBody List<Student> students){
        System.out.println(students);
        return "created";
    }
}
