package com.example.FirstSpring;

import org.springframework.web.bind.annotation.*;

// ready to use spring mvc to handle web request, It combination of controller + response body
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello, "+name);
    }

    @GetMapping("/hello")
    public HelloResponse Hello(){
        return new HelloResponse("Hello world!");
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello " + name + "!");
    }
}
