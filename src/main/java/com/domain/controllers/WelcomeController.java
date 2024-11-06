package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {


    @GetMapping
    public String welcome(){
        return "welcome to Spring Boot Rest API";
    }

}
    