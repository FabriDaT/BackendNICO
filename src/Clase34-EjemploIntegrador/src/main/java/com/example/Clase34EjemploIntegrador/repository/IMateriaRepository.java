package com.example.Clase34EjemploIntegrador.repository;

import com.example.Clase34EjemploIntegrador.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository<Materia, Long> {
}
