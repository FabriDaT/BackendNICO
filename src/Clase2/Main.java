package Clase2;

import Clase2.Model.Empleado;
import Clase2.Service.LiquidadorEmpleadoContratado;
import Clase2.Service.LiquidadorEmpleadoEfectivo;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Liquidador> liquidadores = Map.of("Efectivo", new LiquidadorEmpleadoEfectivo(),
                                                      "Contratado", new LiquidadorEmpleadoContratado());
        System.out.println(liquidadores);
        List<Empleado> empleados = List.of();
        System.out.println(empleados);
    }
}
