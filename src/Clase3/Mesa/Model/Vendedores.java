package Clase3.Mesa.Model;

public abstract class Vendedores {
    private String nombre;
    private String categoria;
    private int puntos;

    public Vendedores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public abstract void calcularCategoria();

    public abstract void mostrarCategoria();
    public abstract void vender();

    public void conseguirAfiliado(){};
}
