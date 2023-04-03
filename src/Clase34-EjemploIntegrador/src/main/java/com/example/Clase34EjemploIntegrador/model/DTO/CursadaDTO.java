package com.example.Clase34EjemploIntegrador.model.DTO;

import com.example.Clase34EjemploIntegrador.model.Estudiante;
import com.example.Clase34EjemploIntegrador.model.Materia;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CursadaDTO {
    //nos permite transportar informacion de una capa a la otra
    private Long id;
    private Double nota;
    private Estudiante estudiante;
    private Materia materia;

//    public CursadaDTO(Double nota, Estudiante estudiante, Materia materia) {
//        this.nota = nota;
//        this.estudiante = estudiante;
//        this.materia = materia;
//    }
}
