package com.example.jones;

import org.springframework.stereotype.Service;

@Service
public class helloService {

    public String greet() {
        return "Hi guys";
    }

    public String aboutUs() {
        return "IT Department";
    }
}