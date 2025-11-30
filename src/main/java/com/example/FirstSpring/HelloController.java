package com.example.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// ready to use spring mvc to handle web request, It combination of controller + response body
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";
    }
}
