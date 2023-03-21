package com.example.Clase23.service;

import com.example.Clase23.model.Direccion;
import com.example.Clase23.model.Odontologo;
import com.example.Clase23.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class PacienteService implements ClinicaService <Paciente> {

    @Override
    public Paciente buscar(String mail) {
        Paciente paciente = null;
        for (Paciente p:crearTodos()) {
            if (p.getMail().equals(mail)){
                paciente = p;
            }
        }
        return paciente;
    }

    @Override
    public List<Paciente> crearTodos() {
        return Arrays.asList(new Paciente("Nico", "Amaya", "37897454",
                        "amaya.niko@gmail.com", "05/03/2020", new Direccion("Cervantes",
                        "564", "Rio Tercero", "Cordoba")),
                            new Paciente("Agos", "Comello", "37225821",
                        "ago.com93o@gmail.com", "05/03/2021", new Direccion("Cervantes",
                                "564", "Rio Tercero", "Cordoba")));
    }
}
