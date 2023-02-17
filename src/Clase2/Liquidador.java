package Clase2;

import Clase2.Model.Empleado;

public abstract class Liquidador {

    public abstract String liquidarSueldo(Empleado empleado); //Método plantilla (Template Method)

    public String depositarSueldo(Empleado empleado){
        return "Sueldo depositado en la cuenta " + empleado.getNumCuenta();
    }
}
