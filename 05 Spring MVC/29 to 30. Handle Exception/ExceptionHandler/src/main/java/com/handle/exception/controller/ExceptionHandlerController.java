package com.handle.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
public class ExceptionHandlerController {

    @GetMapping("/null")
    public ResponseEntity<String> stringPrint(){
        String[] arr ={"A","B","A","B","A","B"};
        arr =  null;
        return new ResponseEntity<>("print "+String.join(", ", arr), HttpStatus.OK);
    }

    @GetMapping("/number")
    public void exceptionNumberFormat(){
        int a = Integer.parseInt("12abcd");
        System.out.println(a);
    }

    //single exception handler
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerExceptionHandler(NullPointerException ex){
        System.out.println("Null Pointer Exception generated "+ex.getMessage());

        return new ResponseEntity<>("Null Pointer Exception generated "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> numberFormatExceptionHandler(NullPointerException ex){
        System.out.println("Number Format Exception generated "+ex.getMessage());

        return new ResponseEntity<>("Number Format Exception generated "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //handle multiple exceptions in one method

    @ExceptionHandler(value = {NumberFormatException.class, NullPointerException.class})
    public ResponseEntity<String> multipleExceptionHandler(Exception ex){
        System.out.println("Exception generated "+ex.getMessage());
        return new ResponseEntity<>("Exception generated "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
