package com.zack.net.Student.StudentManagement.Service;

import com.zack.net.Student.StudentManagement.entities.Student;

import java.util.List;

public interface StudentServiceImpl {
     //Save Student
    Student save(Student student);
    //Get student by Email
    Student findByEmail(String email);
    //Update student
    Student updateStudent(Student student);
    //Get All students
    List<Student> findAllStudents();
    //Delete student by email
    void deleteStudent(String email);
}
