package com.example.jones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Qualifier("sketch")
    @Autowired
    Writer w;

    public void exam() {
        System.out.println("I am writing");
    }

    public void writeexam() {
        w.write();
    }
}