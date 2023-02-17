package Clase2.Test;

import Clase2.Liquidador;
import Clase2.Model.Empleado;
import Clase2.Model.EmpleadoContratado;
import Clase2.Model.EmpleadoEfectivo;
import Clase2.Service.LiquidadorEmpleadoContratado;
import Clase2.Service.LiquidadorEmpleadoEfectivo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LiquidadorTest {
    @Test
    public void deberiaEmitirUnDocumentoDigitalParaUnEmpleadoEfectivo(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martín", "Martini", "001A", 400, 60, 40);
        String restultadoEsperado = "La liquidación generada es un documento digital. Saldo a liquidar: 420";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        Assertions.assertEquals(restultadoEsperado, resultado);
    }

    @Test
    public void deberiaEmitirUnDocumentoImpresoParaUnEmpleadoContratado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoContratado();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini", "001B", 120, 7);
        String restultadoEsperado = "La liquidación generada es un documento impreso. Saldo a liquidar: 840";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        Assertions.assertEquals(restultadoEsperado, resultado);
    }

    @Test
    public void deberiaRetornarUnMensajeDeErrorCuandoNoSePuedeLiquidarUnEmpleado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini", "001B", 120, 7);
        String restultadoEsperado = "La liquidación no pudo ser calculada.";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        Assertions.assertEquals(restultadoEsperado, resultado);
    }
}
