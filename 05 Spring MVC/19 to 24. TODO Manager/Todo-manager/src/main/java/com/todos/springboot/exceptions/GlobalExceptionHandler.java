package com.todos.springboot.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //create method for specific exception
    //pre-define exception
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handlerNullPointerException(NullPointerException ex){
        logger.info("It's Null Pointer Exception from Global Handler");
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //custom exception / user define exception
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
        logger.error("Error: {}", ex.getMessage());
        ExceptionResponse response = new ExceptionResponse();
        response.setMessage(ex.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setSuccess(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
