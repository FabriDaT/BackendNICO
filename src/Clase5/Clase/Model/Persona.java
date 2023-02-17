package Clase5.Clase.Model;

import java.util.Date;

public class Persona {
    private String nombre;
    private String dni;
    private Date fecha;
    private String vacuna;

    public Persona(String nombre , String dni , Date fecha , String vacuna) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.vacuna = vacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
}

