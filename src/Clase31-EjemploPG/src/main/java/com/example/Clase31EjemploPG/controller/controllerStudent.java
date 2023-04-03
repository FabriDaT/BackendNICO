package com.example.Clase31EjemploPG.controller;

import com.example.Clase31EjemploPG.entity.Student;
import com.example.Clase31EjemploPG.repository.IStudentRepository;
import com.example.Clase31EjemploPG.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class controllerStudent {
    @Autowired
    //sirve para inyectar un componente, configuracion,
    //servicios y beans, usando la autodeteccion de Spring

    StudentServiceImpl studentService;

    public controllerStudent(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @PostMapping("/student/add")
    public Student addStudent(@RequestBody Student studentNew) {
        return studentService.saveStudent(studentNew);
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/students/update")
    public String updateStudent(Student studentNew) {
        return studentService.updateStudent(studentNew);
    }

}
