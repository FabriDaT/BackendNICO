package com.example.Clase27.model;

import java.util.ArrayList;
import java.util.List;

public class Turno {
    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private String fechaHora;
    private List listadoTurnos;

    public Turno(Paciente paciente , Odontologo odontologo , String fechaHora) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaHora = fechaHora;
        this.listadoTurnos = new ArrayList<>();
    }

    public List getListadoTurnos() {
        return listadoTurnos;
    }

    public void setListadoTurnos(List listadoTurnos) {
        this.listadoTurnos = listadoTurnos;
    }
    public void agregarListado(Turno turno){
        listadoTurnos.add(turno);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
}
