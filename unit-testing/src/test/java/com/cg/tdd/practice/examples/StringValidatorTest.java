package com.cg.tdd.practice.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTest {

    StringValidator stringValidator;

    @BeforeEach
    void init() {
        stringValidator = new StringValidator();
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnTrueIfStringIsNull(String str) {
        assertTrue(stringValidator.isBlank(str));
    }

    @ParameterizedTest
    @EmptySource
    void shouldReturnTrueIfStringIsEmpty(String str) {
        assertTrue(stringValidator.isBlank(str));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnTrueIfStringIsNullAndEmpty(String str) {
        assertTrue(stringValidator.isBlank(str));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"  ", ""})
    void shouldReturnTrueIfStringIsNullAndEmpty_1(String str) {
        assertTrue(stringValidator.isBlank(str));
    }

    @ParameterizedTest
    @CsvSource({
            "' ',true",
            "'java',false",
            "'',true",
            "' hello ',false"
    })
    void shouldCheckWhetherStringIsBlank(String str, boolean expected) {
        assertEquals(expected,stringValidator.isBlank(str));
    }
}
