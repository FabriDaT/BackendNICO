package Clase3.Mesa.OtraSolucion.model;

public class Empleado extends Vendedor {
  private int cantidadAfiliados;
  private int antiguedad;

  public Empleado(String nombre, int puntos, int cantidadVentas, String categoria, int cantidadAfiliados, int antiguedad) {
    super(nombre, puntos, cantidadVentas, categoria);
    this.cantidadAfiliados = cantidadAfiliados;
    this.antiguedad = antiguedad;
  }

  public int getCantidadAfiliados() {
    return cantidadAfiliados;
  }

  public void setCantidadAfiliados(int cantidadAfiliados) {
    this.cantidadAfiliados = cantidadAfiliados;
  }

  public int getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(int antiguedad) {
    this.antiguedad = antiguedad;
  }

}
