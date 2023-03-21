package com.example.Clase23.service;

import com.example.Clase23.model.Odontologo;
import com.example.Clase23.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoService implements ClinicaService <Odontologo>{

    @Override
    public Odontologo buscar(String buscador) {
        Odontologo odontologo = null;
        for (Odontologo o : crearTodos()) {
            if (o.getMatricula().equals(buscador)){
                odontologo = o;
            }
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> crearTodos() {
        return Arrays.asList(new Odontologo("Juan", "Baez", "25049"),
                            new Odontologo("Cristian", "Perez", "29430"));
    }
}
