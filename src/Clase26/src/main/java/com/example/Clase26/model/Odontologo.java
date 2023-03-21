package com.example.Clase26.model;

public class Odontologo {
    private long id;
    private long matricula;
    private String nombre;
    private String apellido;

    public Odontologo(long matricula , String nombre , String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

