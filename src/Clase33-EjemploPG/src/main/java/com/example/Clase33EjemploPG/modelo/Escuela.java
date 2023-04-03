package com.example.Clase33EjemploPG.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    @OneToMany(mappedBy = "escuela", fetch = FetchType.LAZY)
    //mappeBy se utiliza para indicar quien establece la relacion.
    //se elige "LAZY" porque no va a cargar a los alumnos a la tabla hasta que no los llame.
    //@JsonIgnore
    @JsonIgnore
    Set<Alumno> alumnos = new HashSet<>();
    //un HashSet no permite objetos repetidos

}
