package com.javakar.crud_spring_demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    @GetMapping("test")
    public String getTest(){
        return "Works!";
    }


    @Autowired
    private StudentService studentService;

    @GetMapping
    List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @PostMapping
    Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping
    Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping
    String deleteStudent(@RequestBody Student student){
        return studentService.deleteStudent(student);
    }

}
