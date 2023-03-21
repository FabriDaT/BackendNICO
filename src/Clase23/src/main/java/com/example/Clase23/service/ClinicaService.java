package com.example.Clase23.service;

import com.example.Clase23.model.Odontologo;
import com.example.Clase23.model.Paciente;

import java.util.List;

public interface ClinicaService<T> {
        T buscar(String buscador);
        List<T> crearTodos();
}
