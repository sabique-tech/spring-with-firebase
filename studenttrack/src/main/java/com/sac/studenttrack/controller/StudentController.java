package com.sac.studenttrack.controller;

import com.sac.studenttrack.dao.StudentRepository;
import com.sac.studenttrack.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/students")
    public ResponseEntity getStudentList() {
        List<Student> studentList = null;
        studentList = repository.findAll();
        return ResponseEntity.ok(studentList);
    }

    @PostMapping("/students")

    public ResponseEntity saveStudent(@RequestBody Student student) {
        Student student1 = repository.save(student);
        return ResponseEntity.ok(student1);
    }

    @PutMapping("/students")
    public ResponseEntity updateStudent(@RequestBody Student student) {
        Student student1 = repository.save(student);
        return ResponseEntity.ok(student1);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Delete Successfully");
    }


}
