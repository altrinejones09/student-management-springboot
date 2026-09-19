package com.example.jones;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Pen implements Writer {

    public void write() {
        System.out.println("writing using pen");
    }
}