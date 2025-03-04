package com.zack.net.Student.StudentManagement.Controller;



import com.zack.net.Student.StudentManagement.Service.InMemoryStudentService;
import com.zack.net.Student.StudentManagement.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentContoller {
    @Autowired
    private InMemoryStudentService studentService;

@GetMapping
public List<Student> findAllStudents() {
    return studentService.findAllStudents();
}
@PostMapping
    public Student save(@RequestBody Student student) {
       return studentService.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

@PutMapping
public Student updateStudent(@RequestBody Student student) {
    return studentService.save(student);
}

@DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email) {
    studentService.deleteStudent(email);
     }
}
