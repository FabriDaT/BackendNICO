package com.example.Clase22.service;

import com.example.Clase22.model.Entrenador;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class EntrenadorServiceImplementacion implements EntrenadorService{
    @Override
    public List<Entrenador> listaEntrenador() {
        return Arrays.asList(new Entrenador("Nico Amaya"),
                            new Entrenador("Bruno Martini"),
                            new Entrenador("test"));
    }
}
