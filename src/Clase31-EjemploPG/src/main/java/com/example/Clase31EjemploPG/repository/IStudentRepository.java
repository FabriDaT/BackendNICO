package com.example.Clase31EjemploPG.repository;

import com.example.Clase31EjemploPG.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IStudentRepository  extends JpaRepository<Student, Long> {

}
