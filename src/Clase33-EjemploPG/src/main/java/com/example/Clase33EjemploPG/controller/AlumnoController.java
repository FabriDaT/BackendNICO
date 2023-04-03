package com.example.Clase33EjemploPG.controller;

import com.example.Clase33EjemploPG.modelo.Alumno;
import com.example.Clase33EjemploPG.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/all")
    public List<Alumno> getAll() {
        return alumnoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Alumno> getById(@PathVariable Long id) {
        return alumnoService.findById(id);
    }

    @PostMapping("/add")
    public Alumno add(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return alumnoService.delete(id);
    }

    @PutMapping("/update")
    public String update(Alumno alumno) {
        return alumnoService.update(alumno);
    }
}
