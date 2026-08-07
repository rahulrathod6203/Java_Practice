package com.cg.tdd.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNumberTest {

    // if the number is 0 -> ZERO
    @Test
    void shouldCheckZeroNumber() {
        assertEquals("Zero", CheckNumber.check(0));
    }

    // if a number is greater than 0 -> POSITIVE
    @Test
    void shouldCheckNumberIsPositive() {
        assertEquals("Positive", CheckNumber.check(2));
    }

    // if a number is less than 0 -> NEGATIVE
    @Test
    void shouldTestNumberIsNegative() {
        assertEquals("Negative", CheckNumber.check(-2));
    }

}
