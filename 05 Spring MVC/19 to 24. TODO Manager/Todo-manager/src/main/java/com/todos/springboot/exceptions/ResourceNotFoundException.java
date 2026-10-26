package com.todos.springboot.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends RuntimeException{
    private String message;
    private HttpStatus stuts;

    //default constructor
    public ResourceNotFoundException(){}

    //parameterize Constructor
    public ResourceNotFoundException(String message, HttpStatus stuts) {
        super(message); //send message to RuntimeException class
        this.message = message;
        this.stuts = stuts;
    }

    // getter - setter

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStuts() {
        return stuts;
    }

    public void setStuts(HttpStatus stuts) {
        this.stuts = stuts;
    }
}
