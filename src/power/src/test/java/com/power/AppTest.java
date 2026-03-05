package com.power;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for recursive power function.
 */
public class AppTest {
    // Paremeter format: Base, Exponent, Expected Result
    @ParameterizedTest
    @CsvSource({
            "2, 2, 4.0",
            "2, 3, 8.0",
            "5, 0, 1.0",
            "0, 5, 0.0",
            "-2, 2, 4.0",
            "-2, 3, -8.0",
            "2.3, 4, 27.9841"
    })
    public void testPower(double base, int exponent, double expected) {
        assertEquals(expected, App.power(base, exponent), 0.001);
    }
}
