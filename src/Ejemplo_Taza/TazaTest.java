package Ejemplo_Taza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TazaTest {
    Taza taza = new Taza("Jugo de Naranja", 70.5);

    @Test
        void getTipoLiquido() {
            assertEquals("Jugo de Naranja", taza.getTipoLiquido());
        }
    @Test
    void getPorcentaje() {
            assertEquals(70, taza.getPorcentaje());
    }
}