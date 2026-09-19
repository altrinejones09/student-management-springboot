package com.example.jones.service;

import com.example.jones.Model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> list = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Giri", "Java"),
                    new Student(2, "July", "SpringBoot")
            )
    );

    public List<Student> getAllStudent() {
        return list;
    }

    public Student getAllStudentByRollNo(int roll) {
        int ind = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRno() == roll) {
                ind = i;
                break;
            }
        }

        return list.get(ind);
    }

    public void addStudent(Student std) {
        list.add(std);
    }

    public String updateStudent(Student std) {
        int ind = 0;
        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRno() == std.getRno()) {
                ind = i;
                flag = true;
                break;
            }
        }

        if (!flag) {
            return "invalid data";
        } else {
            list.set(ind, std);
            return "updated";
        }
    }

    public String deleteStudentByRollNo(int rno) {
        int ind = 0;
        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRno() == rno) {
                ind = i;
                flag = true;
                break;
            }
        }

        if (flag) {
            list.remove(ind);
            return "deleted";
        } else {
            return "no such element";
        }
    }

    public String delteAllStudents() {
        list.clear();
        return "deleted";
    }
}