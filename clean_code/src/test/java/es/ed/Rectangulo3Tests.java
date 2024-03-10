package es.ed;

//BLOQUE 6: TESTS UNITARIOS

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ed.model.Bloque6.Rectangulo3;
import es.ed.model.Bloque6.Rectangulo3.Rectangulo;

class Rectangulo3Tests {

    private Rectangulo3 rectangulo;

    @BeforeEach
    void setUp() {
        rectangulo = new Rectangulo3(0.0, 0.0);
    }

    @Test
    void testArea() {
        Rectangulo rectanguloObj = rectangulo.new Rectangulo(3.0, 4.0);
        double expectedArea = 12.0;
        double actualArea = rectanguloObj.area();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    void testPerimetro() {
        Rectangulo rectanguloObj = rectangulo.new Rectangulo(3.0, 4.0);
        double expectedPerimeter = 14.0;
        double actualPerimeter = rectanguloObj.perimetro();
        assertEquals(expectedPerimeter, actualPerimeter, 0.001);
    }

    @Test
    void testNegativeAncho() {
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo.new Rectangulo(-3.0, 4.0);
        });
    }

    @Test
    void testNegativeAlto() {
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo.new Rectangulo(3.0, -4.0);
        });
    }

    @Test
    void testZeroAncho() {
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo.new Rectangulo(0.0, 4.0);
        });
    }

    @Test
    void testZeroAlto() {
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo.new Rectangulo(3.0, 0.0);
        });
    }

    @Test
    void testBothZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            rectangulo.new Rectangulo(0.0, 0.0);
        });
    }

}