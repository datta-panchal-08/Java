package com.learning.BootP02.controller;

import com.learning.BootP02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/welcome")
    public String dataFetchFromDb(){
        return  studentService.getStudentData();
    }

    @PostMapping
    public void test(){
        System.out.println("Welcome jii..");
    }

    @DeleteMapping
    public void delete(){

    }


}
