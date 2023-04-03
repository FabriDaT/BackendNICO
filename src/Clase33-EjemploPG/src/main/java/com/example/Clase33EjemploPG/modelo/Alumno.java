package com.example.Clase33EjemploPG.modelo;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //se elige "LAZY" porque no va a cargar a los alumnos a la tabla hasta que no los llame.
    //cascade "ALL" quiere decir que si borro una escuela se van a borrar todos los alumnos
    @JoinColumn(name = "escuela_id")
    //foreign key
    private Escuela escuela;


}
