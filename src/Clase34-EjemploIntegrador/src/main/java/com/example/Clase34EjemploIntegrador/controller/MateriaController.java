package com.example.Clase34EjemploIntegrador.controller;

import com.example.Clase34EjemploIntegrador.model.DTO.MateriaDTO;
import com.example.Clase34EjemploIntegrador.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;


    @GetMapping
    public ResponseEntity<MateriaDTO> findAll() {
        if (materiaService.findAll().isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(materiaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MateriaDTO> findById(@PathVariable Long id) {
        if (materiaService.findById(id).isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(materiaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody MateriaDTO materiaDTO) {
        materiaService.save(materiaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        materiaService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody MateriaDTO materiaDTO) {
        materiaService.update(materiaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
