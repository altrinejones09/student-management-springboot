package com.example.FistSbIT;

import com.example.jones.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    helloService service;
    @GetMapping("/")
    public String greet(){
        return service.greet();
    }
    @GetMapping("/about")
    public String aboutUs(){
        return service.aboutUs();
    }
}