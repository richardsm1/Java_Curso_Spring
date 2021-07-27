package com.example.cursospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class teste {

    @GetMapping(value = "/hello")
    public String helloWorld(){
        return "Hello, World";
    }
}
