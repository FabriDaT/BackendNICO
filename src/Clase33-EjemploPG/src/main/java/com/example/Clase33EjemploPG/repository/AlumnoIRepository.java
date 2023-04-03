package com.example.Clase33EjemploPG.repository;

import com.example.Clase33EjemploPG.modelo.Alumno;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoIRepository extends JpaRepository<Alumno, Long> {}
