package com.se.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController{

    @GetMapping(value = "/api/greet")
    public String greet(){
        return "hello world";
    }
}
