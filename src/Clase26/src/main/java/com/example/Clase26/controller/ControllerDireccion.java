package com.example.Clase26.controller;

import com.example.Clase26.dao.DireccionDaoH2;
import com.example.Clase26.model.Direccion;
import com.example.Clase26.model.Paciente;
import com.example.Clase26.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccion")
public class ControllerDireccion {

    private final DireccionService direccionService;
    @Autowired

    public ControllerDireccion(DireccionService direccionService) {
        this.direccionService = direccionService;
        direccionService.setDireccionIdao(new DireccionDaoH2());
    }

    @GetMapping("/buscar/{id}")
    public Direccion buscarDireccion(@PathVariable("id") Long id){
        return direccionService.listar(id);
    }
    @GetMapping("/listartodos")
    public List<Direccion> listarTodosPacientes(){
        return direccionService.listarTodos();
    }
    @PostMapping("/agregar")
    public Direccion agregarDireccion(@RequestBody Direccion direccion){
        return direccionService.agregar(direccion);
    }
    @PutMapping("/modificar/{id}")
    public Direccion modificarOdontologo(@PathVariable ("id") long id, @RequestBody Direccion direccion){
        return direccionService.modificar(id, direccion);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPaciente(@PathVariable ("id") Long id){
        direccionService.eliminar(id);
    }
}
