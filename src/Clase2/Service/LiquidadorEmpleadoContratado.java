package Clase2.Service;

import Clase2.Liquidador;
import Clase2.Model.Empleado;
import Clase2.Model.EmpleadoContratado;

public class LiquidadorEmpleadoContratado extends Liquidador {

    @Override
    public String liquidarSueldo(Empleado empleado) {
        String mensajeDeRespuesta = "La liquidación no pudo ser calculada.";

        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado; //casteo
            double sueldoFinal = empleadoContratado.getHoras() * empleadoContratado.getValorHora();
            mensajeDeRespuesta = "La liquidación generada es un documento impreso. Saldo a liquidar: " + sueldoFinal;
        }

        return mensajeDeRespuesta;
    }
}
