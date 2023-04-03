package com.example.Clase31Mesa.controller;

import com.example.Clase31Mesa.entity.Usuarios;
import com.example.Clase31Mesa.service.ServiceUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class controller {
    @Autowired
    ServiceUsuarios serviceUsuarios;

    public controller(ServiceUsuarios serviceUsuarios) {
        this.serviceUsuarios = serviceUsuarios;
    }
    @GetMapping("/all")
    public List<Usuarios> getAll() {
        return serviceUsuarios.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> getById(@PathVariable Long id) {
        return serviceUsuarios.findById(id);
    }

    @PostMapping("/add")
    public Usuarios add(@RequestBody Usuarios usuarios) {
        return serviceUsuarios.save(usuarios);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return serviceUsuarios.delete(id);
    }

    @PutMapping("/update")
    public String update(Usuarios studentNew) {
        return serviceUsuarios.update(studentNew);
    }


}
