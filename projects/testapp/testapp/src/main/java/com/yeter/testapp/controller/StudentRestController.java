//package com.yeter.testapp.controller;
//
//import com.yeter.testapp.model.Student;
//import com.yeter.testapp.repository.StudentsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//
//
//public class StudentRestController {
//    @Autowired
//    private StudentsRepository studentRepository;
//
//    @GetMapping(path = "/student")
//    public Student studentObject(){
//        Student s= new Student(7,"Nane","haciyev","nane@gmail.com",509993344);
//        return s;
//    }
//    @GetMapping(path = "/students")
//    public List<Student> studentObjects(){
//        return studentRepository.findAll();
//    }
//    @PostMapping(path = "/add")
//    public void add(@RequestBody Student student){
//        student.setId(null);
//        studentRepository.save(student);
//    }
//    @PutMapping
//    public void update(@RequestBody Student student){
//        studentRepository.save(student);
//
//    }
//    @DeleteMapping(path = " /{id}")
//    public void deleteById(@PathVariable Integer id){
//        studentRepository.deleteById(id);
//    }
//}
