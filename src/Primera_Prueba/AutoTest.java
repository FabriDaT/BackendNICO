package Primera_Prueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    @Test
    public void Multiplicaciones()
    {
        assertEquals(4, 2*2);
        assertEquals(8, 2*4);
        assertEquals(12, 3*4);
        assertEquals(15, 3*5);
        assertNotEquals(3, 4);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull("Hello");
        //assertNotSame(originalObject, otherObject);
    }
}