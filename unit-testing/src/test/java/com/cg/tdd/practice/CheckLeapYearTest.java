package com.cg.tdd.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CheckLeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {2024, 1600})
    void shouldReturnTrueIfLeapYear(int year) {
        assertTrue(CheckLeapYear.check(year));
    }

    @Test
    void shouldReturnFalseIfNotLeapyear() {
        assertFalse(CheckLeapYear.check(1975));
    }
    

}
