package Clase3.Mesa.OtraSolucion.services.impl;

import Clase3.Mesa.OtraSolucion.model.Empleado;
import Clase3.Mesa.OtraSolucion.model.Vendedor;
import Clase3.Mesa.OtraSolucion.services.Calcular;

public class CalcularEmpleado extends Calcular {

  @Override
  public void calcularPuntos(Vendedor vendedor) {
    if (vendedor instanceof Empleado empleado) {
      empleado.setPuntos(empleado.getAntiguedad() * 5 + empleado.getCantidadVentas() * 5 + empleado.getCantidadAfiliados() * 10);
    }
  }
}
