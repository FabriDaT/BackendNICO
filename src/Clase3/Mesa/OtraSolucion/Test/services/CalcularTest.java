package Clase3.Mesa.OtraSolucion.Test.services;

import Clase3.Mesa.OtraSolucion.model.Vendedor;
import Clase3.Mesa.OtraSolucion.services.Calcular;
import Clase3.Mesa.OtraSolucion.services.impl.CalcularAfiliado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcularTest {

    @Test
    void calcularPuntos() {
        Calcular calcular = new CalcularAfiliado();
        Vendedor vendedor = new Vendedor("Juan", 0, 0, "");
        vendedor.vender(2);
        calcular.mostrarCategoria(vendedor);
        assertEquals(30, vendedor.getPuntos());
    }

}