package com.zack.net.Student.StudentManagement.Service;

import com.zack.net.Student.StudentManagement.entities.Student;

import java.util.List;

public interface StudentServiceImpl {

    List<Student> findAllStudents();
}
