package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void positiveSumTest() {
        assertEquals(3.0, Main.add(1.0,2.0));
    }
    @Test
    void negativeSumTest() {
        assertEquals(-1, Main.add(-4.0,3.0));
    }

    @Test
    void wholeQuotientTest() {
        assertEquals(2.0, Main.divide(4.0,2.0));
    }
    @Test
    void decimalQuotientTest() {
        assertEquals(0.5, Main.divide(2.0,4.0));
    }

    @Test
    void positiveProductTest() {
        assertEquals(2.0, Main.multiply(1.0,2.0));
    }
    @Test
    void negativeProductTest() {
        assertEquals(-4, Main.multiply(-1.0,4.0));
    }

    @Test
    void positiveDifferenceTest() {
        assertEquals(2.0, Main.subtract(4.0,2.0));
    }
    @Test
    void negativeDifferenceTest() {
        assertEquals(-4, Main.subtract(-2.0,2.0));
    }
}