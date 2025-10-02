package dev.kuchishkin.Testing.lesson4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturnSumOfTwoNegativeNumbers() {
        assertEquals(-5, calculator.sum(-2, -3));
    }

    @Test
    void shouldReturnSumOfTwoZeroNumbers() {
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    void shouldReturnSumOfZeroAndPositiveNumber() {
        assertEquals(3, calculator.sum(0, 3));
    }

    @Test
    void shouldReturnSumOfZeroAndNegativeNumber() {
        assertEquals(-3, calculator.sum(0, -3));
    }

    @Test
    void shouldReturnMultiplicationOfTwoPositiveNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void shouldReturnMultiplicationOfTwoNegativeNumbers() {
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    void shouldReturnMultiplicationOfTwoZeroNumbers() {
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    void shouldReturnMultiplicationOfZeroAndPositiveNumber() {
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    void shouldReturnSubtractionOfTwoPositiveNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void shouldReturnSubtractionOfTwoNegativeNumbers() {
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    void shouldReturnSubtractionOfZeroAndPositiveNumber() {
        assertEquals(-3, calculator.subtract(0, 3));
    }

    @Test
    void shouldReturnSubtractionOfZeroAndNegativeNumber() {
        assertEquals(3, calculator.subtract(0, -3));
    }

    @Test
    void shouldReturnSubtractionOfPositiveNumberAndNegativeNumber() {
        assertEquals(7, calculator.subtract(4, -3));
    }
}
