package com.example.Clase34EjemploIntegrador.model.DTO;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MateriaDTO {
    //nos permite transportar informacion de una capa a la otra
    private Long id;
    private String nombre;

//    public MateriaDTO(String nombre) {
//        this.nombre = nombre;
//    }
}
