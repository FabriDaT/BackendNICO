package com.example.Clase31EjemploPG.service;

import com.example.Clase31EjemploPG.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAllStudents();
    Optional<Student> findStudentById(Long id);
    Student saveStudent(Student studentNew);
    String deleteStudent(Long id);
    String updateStudent(Student studentNew);
}
