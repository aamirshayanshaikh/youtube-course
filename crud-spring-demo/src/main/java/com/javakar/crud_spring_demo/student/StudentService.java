package com.javakar.crud_spring_demo.student;


import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    String deleteStudent(Student student);

}
