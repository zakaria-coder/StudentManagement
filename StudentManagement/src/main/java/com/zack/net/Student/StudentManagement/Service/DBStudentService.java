package com.zack.net.Student.StudentManagement.Service;

import com.zack.net.Student.StudentManagement.Repository.StudentRepository;
import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBStudentService implements StudentServiceImpl {


    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteStudentByEmail(email);
    }
}
