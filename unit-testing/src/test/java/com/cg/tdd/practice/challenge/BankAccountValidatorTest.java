package com.cg.tdd.practice.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountValidatorTest {

    BankAccountValidator accountValidator;

    @BeforeEach
    void init() {
        accountValidator = new BankAccountValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Rahul", "John Doe", "Priya123"})
    void shouldTestValidAccountHolderName(String name) {
        assertTrue(accountValidator.isValidAccountHolderName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ra", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"})
    void shouldTestInValidAccountHolderName(String name) {
        assertFalse(accountValidator.isValidAccountHolderName(name));
    }

    @ParameterizedTest
    @CsvSource({
            "18,true",
            "17,false",
            "16,false",
            "60,true",
            "61,false"
    })
    void shouldValidateAge(int age, boolean expected) {
        assertEquals(expected, accountValidator.isValidAge(age));
    }

    public static Stream<Arguments> accountNumberTestData() {
        return Stream.of(
                Arguments.of("1234567890", true),
                Arguments.of("12345", false),
                Arguments.of(null, false),
                Arguments.of("123456789A", false)
        );
    }

    @ParameterizedTest
    @MethodSource("accountNumberTestData")
    void shouldValidateAccountNumber(String accountNumber, boolean expected) {
        assertEquals(expected, accountValidator.isValidAccountNumber(accountNumber));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void shouldValidateEmptyAndNullValues(String value) {
        assertTrue(accountValidator.isBlank(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "hi"})
    void shouldValidateNotEmptyOrNonNullValues(String value) {
        assertFalse(accountValidator.isBlank(value));
    }

}
