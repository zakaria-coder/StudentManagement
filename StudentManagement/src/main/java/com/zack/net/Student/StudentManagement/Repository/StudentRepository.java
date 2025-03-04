package com.zack.net.Student.StudentManagement.Repository;

import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findStudentByEmail(String email);

    void deleteStudentByEmail(String email);
}
