package com.uri.PathVariable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @GetMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(
            @PathVariable("productId") int id,
            @PathVariable(value = "productName", required = false) String name,
            @PathVariable int productRating
    ){
        System.out.println("Product Name: "+name);
        System.out.println("Product ID: "+id);
        System.out.println("Product Rating: "+productRating);

        return "this is checking the concept of path variable";
    }
}
