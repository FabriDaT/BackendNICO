package com.example.Clase34EjemploIntegrador.controller;

import com.example.Clase34EjemploIntegrador.model.DTO.CursadaDTO;
import com.example.Clase34EjemploIntegrador.service.CursadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursada")
public class CursadaController {
    @Autowired
    CursadaService cursadaService;

    @GetMapping
    public ResponseEntity<CursadaDTO> findAll() {
        if (cursadaService.findAll().isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(cursadaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursadaDTO> findById(@PathVariable Long id) {
        if (cursadaService.findById(id).isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(cursadaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CursadaDTO cursadaDTO) {
        cursadaService.save(cursadaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        cursadaService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody CursadaDTO cursadaDTO) {
        cursadaService.update(cursadaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
