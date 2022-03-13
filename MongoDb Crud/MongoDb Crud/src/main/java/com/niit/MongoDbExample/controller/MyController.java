package com.niit.MongoDbExample.controller;

import com.niit.MongoDbExample.models.Student;
import com.niit.MongoDbExample.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/student")
public class MyController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudents()
    {
        return ResponseEntity.ok(studentRepository.findAll());
    }

}
