package com.zack.net.Student.StudentManagement.Dao;


import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentServiceDao  {

    private final List<Student> students = new ArrayList<>();

    public Student save(Student student) {
        students.add(student);
        return  student;
    }

    public Student findbyEmail(String email) {
        return students.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst().orElse(null);
    }

    public Student updateStudent(Student student) {
        var studIndex = IntStream.range(0, students.size()).filter(index -> students.get(index).getEmail().equals(student.getEmail()))
                .findFirst().orElse(-1);
         if (studIndex > -1) {
             students.set(studIndex, student);
             return student;
         }
        return null ;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public void deleteStudent(String email) {
        var student = findbyEmail(email);
        if (student != null) {
            students.remove(student);
        }

    }


}
