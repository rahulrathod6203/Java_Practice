package com.cg.tdd.practice.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    Calculator calculator;

    //Arrange
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    // Add
    @Test
    public void shouldAddTwoPositiveNumbers() {
        //Act
        int actual = calculator.add(10, 20);
        //Assess
        assertEquals(30, actual);
    }

    //subtract
    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    // multiply
    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    // Divide
    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void shouldThrowArithmeticExceptionWhenDivisorIsZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 7, 10})
    public void shouldReturnTrueIfPositive(int number) {
        assertTrue(calculator.isPositive(number));
    }



}
