package com.cg.tdd.practice.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ProductValidatorTest {

    ProductValidator productValidator;


    @BeforeEach
    void init() {
        productValidator = new ProductValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Laptop", "Java Book", "iPhone15", "Keyboard"})
    void shouldReturnTrueIfProductNameIsValid(String productName) {
        assertTrue(productValidator.isValidProductName(productName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"TV", "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345", "ab"})
    void shouldReturnFalseIfProductNameIsNotValid(String productName) {
        assertFalse(productValidator.isValidProductName(productName));
    }

    @ParameterizedTest
    @CsvSource({
            "1.0,true",
            "10.5,true",
            "999.99,true",
            "0.99,false",
            "0.0,false",
            "-10.0,false"
    })
    void shouldValidateIfPriceIsGreaterThanZero(double price, boolean expected) {
        assertEquals(expected, productValidator.isValidPrice(price));
    }

    @ParameterizedTest
    @CsvSource({
            "1,true",
            "10,true",
            "100,true",
            "0,false",
            "101,false",
            "-5,false"
    })
    void shouldValidateIfQuantityIsBetweenOneAndHundred(int quantity, boolean expected) {
        assertEquals(expected, productValidator.isValidQuantity(quantity));
    }

    @ParameterizedTest
    @CsvSource({
            "Electronics,true",
            "Books,true",
            "Clothing,true",
            "Food,true",
            "electronics,false",
            "Unknown,false",
            "123,false"
    })
    void shouldValidateCategoryIsNullOrEmpty(String category, boolean expected) {
        assertEquals(expected, productValidator.isValidCategory(category));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "  ", "\t", "\n"})
    void shouldValidateForNullOrBlankValues(String value) {
        assertTrue(productValidator.isBlank(value));
    }

    public static Stream<Arguments> productsTestData() {
        return Stream.of(
                Arguments.of("Laptop", 50000.0, 1, true),
                Arguments.of("Java Book", 499.0, 5, true),
                Arguments.of("TV", 50000.0, 1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("productsTestData")
    void shouldValidateProductInfo(String productName, double price, int quantity, boolean expected) {


        assertEquals(expected, productValidator.isValidProductName(productName));
        assertEquals(expected, productValidator.isValidPrice(price));
        assertEquals(expected, productValidator.isValidQuantity(quantity));
    }

}
