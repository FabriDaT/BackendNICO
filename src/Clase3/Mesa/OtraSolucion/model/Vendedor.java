package Clase3.Mesa.OtraSolucion.model;

public class Vendedor {
  private String nombre;
  private int puntos;
  private int cantidadVentas;
  private String categoria;

  public Vendedor(String nombre, int puntos, int cantidadVentas, String categoria) {
    this.nombre = nombre;
    this.puntos = puntos;
    this.cantidadVentas = cantidadVentas;
    this.categoria = categoria;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPuntos() {
    return puntos;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }

  public int getCantidadVentas() {
    return cantidadVentas;
  }

  public void setCantidadVentas(int cantidadVentas) {
    this.cantidadVentas = cantidadVentas;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public void vender(int cantidad) {
    this.cantidadVentas += cantidad;
  }

}
