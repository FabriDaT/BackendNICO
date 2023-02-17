package Clase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema x = new Sistema();

    @Test
    void agregarPersonasTest() {
        Persona p1 = new Persona("Nico" , 19);
        Persona p2 = new Persona("Agostina" , 32);
        Persona p3 = new Persona("Bruno" , 15);
        Persona p4 = new Persona("San" , 25);

        x.agregarPersonas(p1);
        x.agregarPersonas(p2);
        x.agregarPersonas(p3);
        x.agregarPersonas(p4);

        assertEquals(2, x.largoLista());
    }
}