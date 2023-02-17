package Clase3.Mesa.OtraSolucion.services;

import Clase3.Mesa.OtraSolucion.model.Vendedor;

abstract public class Calcular {
  abstract public void calcularPuntos(Vendedor vendedor);

  public void recategorizar(Vendedor vendedor) {
    if (vendedor.getPuntos() < 20) {
      vendedor.setCategoria("Novatos");
    } else if (vendedor.getPuntos() >= 20 && vendedor.getPuntos() <= 30) {
      vendedor.setCategoria("Aprendices");
    } else if (vendedor.getPuntos() >= 31 && vendedor.getPuntos() <= 40) {
      vendedor.setCategoria("Bueno");
    } else {
      vendedor.setCategoria("Maestro");
    }
  }

  public void mostrarCategoria(Vendedor vendedor) {
    calcularPuntos(vendedor);
    recategorizar(vendedor);
    System.out.println("El vendedor " + vendedor.getNombre() + " tiene " + vendedor.getPuntos() + " puntos y su categoria es " + vendedor.getCategoria());
  }
}
