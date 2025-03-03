package com.zack.net.Student.StudentManagement.Service;


import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService implements StudentServiceImpl {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Zack", "Elwardi", LocalDate.now(), "zakariaelwardi1@gmail.com", 34)
        );
    }
}
