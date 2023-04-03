package com.example.Clase33EjemploPG.controller;

import com.example.Clase33EjemploPG.modelo.Alumno;
import com.example.Clase33EjemploPG.modelo.Escuela;
import com.example.Clase33EjemploPG.service.EscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/escuela")
public class EscuelaController {
    @Autowired
    EscuelaService escuelaService;

    public EscuelaController(EscuelaService escuelaService) {
        this.escuelaService = escuelaService;
    }

    @GetMapping("/all")
    public List<Escuela> getAll() {
        return escuelaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Escuela> getById(@PathVariable Long id) {
        return escuelaService.findById(id);
    }

    @PostMapping("/add")
    public Escuela add(@RequestBody Escuela escuela) {
        return escuelaService.save(escuela);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return escuelaService.delete(id);
    }

    @PutMapping("/update")
    public String update(Escuela escuela) {
        return escuelaService.update(escuela);
    }
}
