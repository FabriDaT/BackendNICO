package Clase13.EjemploPGCompleto;

public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    private double sueldo;

    public Usuario(String nombre , String mail , double sueldo) {
        this.nombre = nombre;
        this.mail = mail;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double subirSueldo(double precio){
        this.sueldo += precio;
        return this.sueldo;
    }
}
