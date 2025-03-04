package com.zack.net.Student.StudentManagement.Service;


import com.zack.net.Student.StudentManagement.Dao.InMemoryStudentServiceDao;
import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentServiceImpl {


    private final InMemoryStudentServiceDao studentServiceDao;

    public InMemoryStudentService(InMemoryStudentServiceDao studentServiceDao) {
        this.studentServiceDao = studentServiceDao;
    }

    @Override
    public Student save(Student student) {
        return studentServiceDao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentServiceDao.findbyEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentServiceDao.updateStudent(student);
    }

    public List<Student> findAllStudents() {
        return studentServiceDao.findAllStudents();
    }

    @Override
    public void deleteStudent(String email) {
      studentServiceDao.deleteStudent(email);
    }
}
