package com.example.Clase26.controller;

import com.example.Clase26.dao.OdontologoDaoH2;
import com.example.Clase26.model.Odontologo;
import com.example.Clase26.service.DireccionService;
import com.example.Clase26.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/odontologo")
public class ControllerOdontologo {

    private final OdontologoService odontologoService;
    @Autowired
    public ControllerOdontologo(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
        odontologoService.setOdontologoIDao(new OdontologoDaoH2());
    }

    @GetMapping("/buscar/{id}")
    public Odontologo buscarOdontologo(@PathVariable("id") Long id){
        return odontologoService.listar(id);
    }
    @GetMapping("/listartodos")
    public List<Odontologo> listarTodosOdontologos(){
        return odontologoService.listarTodos();
    }

    @PostMapping("/agregar")
    public Odontologo agregarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.agregar(odontologo);
    }
    @PutMapping("/modificar/{id}")
    public Odontologo modificarOdontologo(@PathVariable ("id") long id, @RequestBody Odontologo odontologo){
        return odontologoService.modificar(id, odontologo);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarOdontologo(@PathVariable ("id") Long id){
        odontologoService.eliminar(id);
    }



}
