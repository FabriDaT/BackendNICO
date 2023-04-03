package com.example.Clase34EjemploIntegrador.repository;

import com.example.Clase34EjemploIntegrador.model.DTO.EstudianteDTO;
import com.example.Clase34EjemploIntegrador.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
