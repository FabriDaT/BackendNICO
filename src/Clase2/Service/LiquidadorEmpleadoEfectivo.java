package Clase2.Service;

import Clase2.Liquidador;
import Clase2.Model.Empleado;
import Clase2.Model.EmpleadoEfectivo;

public class LiquidadorEmpleadoEfectivo extends Liquidador {
    @Override
    public String liquidarSueldo(Empleado empleado) {
        String mensajeDeRespuesta = "La liquidación no pudo ser calculada.";

        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado; //casteo
            double sueldoFinal = empleadoEfectivo.getSueldoBasico() + empleadoEfectivo.getPremio() - empleadoEfectivo.getDescuentos();
            mensajeDeRespuesta = "La liquidación generada es un documento digital. Saldo a liquidar: " + sueldoFinal;
        }

        return mensajeDeRespuesta;
    }
}
