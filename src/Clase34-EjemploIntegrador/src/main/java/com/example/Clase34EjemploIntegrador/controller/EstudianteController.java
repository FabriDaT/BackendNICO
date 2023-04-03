package com.example.Clase34EjemploIntegrador.controller;

import com.example.Clase34EjemploIntegrador.model.DTO.EstudianteDTO;
import com.example.Clase34EjemploIntegrador.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<EstudianteDTO> findAll() {
        if (estudianteService.findAll().isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(estudianteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDTO> findById(@PathVariable Long id) {
        if (estudianteService.findById(id).isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(estudianteService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody EstudianteDTO estudianteDTO) {
        estudianteService.save(estudianteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        estudianteService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody EstudianteDTO estudianteDTO) {
        estudianteService.update(estudianteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
