package com.todos.springboot.controllers;

import com.todos.springboot.models.Todo;
import com.todos.springboot.services.TodoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoController {
    Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    TodoServices todoServices;
    //generate random integer numbers
    Random random = new Random();

    //create TODO API
    @PostMapping
    public ResponseEntity<Todo> createTodoHandler(@RequestBody Todo todo){

        logger.info("create Todo");

        //set current date in addedDate field
        Date currentDate = new Date();
        todo.setAddedDate(currentDate);
        logger.info("current Data: {}", currentDate);

        //generate random ID
        int id = random.nextInt(1,999);
        todo.setId(id);

        //call service to create TODO
        Todo todo1 = todoServices.createTodo(todo);

        //create ResponseEntity object
        /*
        ResponseEntity<Todo> rs = new ResponseEntity<>(todo1,HttpStatus.CREATED);
        return rs;
         */
        return new ResponseEntity<Todo>(todo1, HttpStatus.CREATED);
    }

    //Get ALl TODO API
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler(){
        logger.info("Get All Todos");
        List<Todo> allTodos = todoServices.getAllTodos();
        return new ResponseEntity<>(allTodos, HttpStatus.OK);
    }

    //Get single TODO API
    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(@PathVariable int todoId){
        logger.info("Get single Todo");
        Todo todo = todoServices.getTodo(todoId);
        return ResponseEntity.ok(todo);
    }

    //update TODO API
    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoHandler(@RequestBody Todo todoWithNewDetails, @PathVariable int todoId)
    {
        logger.info("Update Todo");
        Todo todo = todoServices.updateTodo(todoId, todoWithNewDetails);
        return ResponseEntity.ok(todo);
    }

    //delete TODO API
    @DeleteMapping("/{todoId}")
    public ResponseEntity<String> deleteTodoHandler(@PathVariable int todoId){
        todoServices.deleteTodo(todoId);
        return ResponseEntity.ok("Todo Deleted Successfully");
    }
}
