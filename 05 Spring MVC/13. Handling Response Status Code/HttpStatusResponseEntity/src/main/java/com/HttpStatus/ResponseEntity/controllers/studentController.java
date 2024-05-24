package com.HttpStatus.ResponseEntity.controllers;

import com.HttpStatus.ResponseEntity.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class studentController {

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        System.out.println(student);

        //1st way to create ResponseEntity object
        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);
        return response; // serialization
    }

    @PostMapping("/createStudents")
    public ResponseEntity<List<Student>> createStudents(@RequestBody List<Student> students){

        System.out.println(students);

        //2nd way to create ResponseEntity object
        ResponseEntity<List<Student>> response = ResponseEntity.status(HttpStatus.OK).body(students);
        return response;
    }
}
