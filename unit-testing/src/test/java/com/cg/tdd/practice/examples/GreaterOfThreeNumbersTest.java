package com.cg.tdd.practice.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreaterOfThreeNumbersTest {

    @Test
    void shouldReturnFirstNumberWhenItsLargest() {
        assertEquals(30, GreaterOfThreeNumbers.checkLargest(30, 21, 28));
    }

    @Test
    void shouldReturnSecondNumberWhenItsLargest() {
        assertEquals(30, GreaterOfThreeNumbers.checkLargest(28, 30, 21));
    }

    @Test
    void shouldReturnThirdNumberWhenItsLargest() {
        assertEquals(40, GreaterOfThreeNumbers.checkLargest(30, 21, 40));
    }

    @Test
    void shouldHandleEqualNumbers() {
        assertEquals(40, GreaterOfThreeNumbers.checkLargest(40, 40, 24));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(-2, GreaterOfThreeNumbers.checkLargest(-2, -4, -10));
    }


}
