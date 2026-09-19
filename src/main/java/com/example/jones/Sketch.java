package com.example.jones;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Sketch implements Writer {

    public void write() {
        System.out.println("writing using sketch");
    }
}