package Clase14.Clase.Model;

public class Medicamento {
    private long id;
    private long codigoNumerico;
    private String nombre;
    private String laboratorioProductor;
    private int cantidad;
    private double precio;

    public Medicamento(long id , long codigoNumerico , String nombre , String laboratorioProductor , int cantidad , double precio) {
        this.id = id;
        this.codigoNumerico = codigoNumerico;
        this.nombre = nombre;
        this.laboratorioProductor = laboratorioProductor;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(long codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorioProductor() {
        return laboratorioProductor;
    }

    public void setLaboratorioProductor(String laboratorioProductor) {
        this.laboratorioProductor = laboratorioProductor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
