package com.example.Clase34EjemploIntegrador.repository;

import com.example.Clase34EjemploIntegrador.model.Cursada;
import com.example.Clase34EjemploIntegrador.model.DTO.CursadaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursadaRepository extends JpaRepository<Cursada, Long> {
}
