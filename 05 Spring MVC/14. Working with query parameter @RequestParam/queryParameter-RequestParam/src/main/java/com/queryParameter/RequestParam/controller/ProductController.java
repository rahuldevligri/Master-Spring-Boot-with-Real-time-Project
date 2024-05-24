package com.queryParameter.RequestParam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/getProduct")
    public String getProduct(
            @RequestParam("productId") int id,
            @RequestParam String productName,
            @RequestParam(value ="productRating", defaultValue = "0", required = false) String rating
    ){
        System.out.println("Product Name:"+productName);
        System.out.println("Product ID: "+id);
        System.out.println("Product Rating: "+rating);
        return "this is testing product url";
    }
}
