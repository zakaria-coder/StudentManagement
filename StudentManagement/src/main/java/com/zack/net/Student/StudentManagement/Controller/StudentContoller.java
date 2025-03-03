package com.zack.net.Student.StudentManagement.Controller;


import com.zack.net.Student.StudentManagement.Service.StudentService;
import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentContoller {
    @Autowired
    private StudentService studentService;
@GetMapping
public List<Student> findAllStudents() {
    return studentService.findAllStudents();
}
}
