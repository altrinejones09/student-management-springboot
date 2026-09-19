package com.example.jones.controller;

import com.example.jones.Model.Student;
import com.example.jones.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @GetMapping("students/{rno}")
    public Student getStudentbyRollNo(@PathVariable("rno") int roll) {
        return service.getAllStudentByRollNo(roll);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student std) {
        service.addStudent(std);
        return "added";
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student std) {
        return service.updateStudent(std);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudentByRollNo(@PathVariable("rno") int rno) {
        return service.deleteStudentByRollNo(rno);
    }

    @DeleteMapping("students")
    public String deleteAllStudents() {
        return service.delteAllStudents();
    }
}