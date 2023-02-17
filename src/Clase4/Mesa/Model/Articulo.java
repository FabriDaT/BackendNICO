package Clase4.Mesa.Model;

public class Articulo {
    private String nombre;
    private String envasado;
    private int lote;
    private int peso;

    public Articulo(String nombre , String envasado , int lote , int peso) {
        this.nombre = nombre;
        this.envasado = envasado;
        this.lote = lote;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
