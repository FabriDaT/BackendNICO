package com.example.Clase34EjemploIntegrador.model.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EstudianteDTO {
    //nos permite transportar informacion de una capa a la otra
    private Long id;
    private String nombre;
    private String apellido;

//    public EstudianteDTO(String nombre, String apellido) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//    }
}
