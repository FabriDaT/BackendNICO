package com.example.Clase22.controller;

import com.example.Clase22.model.Entrenador;
import com.example.Clase22.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //hace referencia a service (el modelo) y después automáticamente lo transforma en JSON,  que sería nuestra vista
@RequestMapping("/entrenador") //para agregar nuestra URL, en este caso /entrenador

public class controller {
    private final EntrenadorService entrenadorService;

    @Autowired //es la conexión entre el modelo y el controller
    public controller(EntrenadorService entrenadorService){
    this.entrenadorService = entrenadorService;
    }
    @GetMapping()
    public List<Entrenador> getEntrenador(){
        return entrenadorService.listaEntrenador();
    }
}


