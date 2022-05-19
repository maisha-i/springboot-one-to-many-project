package com.example.karateclub.controller;


import com.example.karateclub.model.Student;
import com.example.karateclub.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @PostMapping
    public Student post(@RequestBody Student student){
        return studentRepository.save(student);
    }


}
