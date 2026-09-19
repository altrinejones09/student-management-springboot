package com.example.jones.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Student {
    private int rno;
    private String name;
    private String Technology;

    public Student(int rno, String name, String technology) {
        this.rno = rno;
        this.name = name;
        Technology = technology;
    }
}