package com.todos.springboot.services;

import com.todos.springboot.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TodoServices {
    Logger logger = LoggerFactory.getLogger(TodoServices.class);
    List<Todo> todos = new ArrayList<>();

    //create TODO
    public Todo createTodo(Todo todo){
        todos.add(todo);
        logger.info("Todos {}", todos);
        return todo;
    }

    //get all TODO
    public List<Todo> getAllTodos() {
        logger.info("Todos {}", todos);
        return todos;
    }

    //get single TODO
    public Todo getTodo(int todoId) {
        Todo todo = todos.stream().filter(t -> todoId == t.getId()).findAny().get();
        logger.info("Todos {}", todos);
        return todo;
    }

    //update TODO
    public Todo updateTodo(int todoId, Todo todo) {
        List<Todo> newUpdateList = todos.stream().map(t -> {
            if(t.getId() == todoId){
                //perform update
                t.setTitle(todo.getTitle());
                t.setContent(todo.getContent());
                t.setStatus(todo.getStatus());
                return t;
            }else{
                return t;
            }
        }).collect(Collectors.toList());
        todos =  newUpdateList;
        todo.setId(todoId);
        logger.info("Todos {}", todos);
        return todo;
    }

    //delete TODO
    public void deleteTodo(int todoId) {
        logger.info("DELETING TODO...");
        List<Todo> newList = todos.stream().filter(t -> t.getId() != todoId).collect(Collectors.toList());
        todos = newList;
    }
}
