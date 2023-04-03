package com.example.Clase34EjemploIntegrador.service;

import com.example.Clase34EjemploIntegrador.model.DTO.EstudianteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EstudianteServiceTest {
    @Autowired
    EstudianteService estudianteService;

    @Test
    public void creartest(){
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteService.save(estudianteDTO);

        assertTrue(estudianteService.findById(estudianteDTO.getId()).isPresent());
    }

}