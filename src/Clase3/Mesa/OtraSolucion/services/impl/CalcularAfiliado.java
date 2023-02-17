package Clase3.Mesa.OtraSolucion.services.impl;

import Clase3.Mesa.OtraSolucion.model.Vendedor;
import Clase3.Mesa.OtraSolucion.services.Calcular;

public class CalcularAfiliado extends Calcular {
  @Override
  public void calcularPuntos(Vendedor vendedor) {
    vendedor.setPuntos(vendedor.getCantidadVentas() * 15);
  }
}
