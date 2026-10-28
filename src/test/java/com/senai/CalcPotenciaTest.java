package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    // 220V x 5A = 1100W
    @Test
    void testarPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(220, 5);
        assertEquals(1100.0, potencia, 0.01);
    }

    // 127V x 10A = 1270W
    @Test
    void testarPotencia127() {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(127, 10);
        assertEquals(1270.0, potencia, 0.01);
    }
}
