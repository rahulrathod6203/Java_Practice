package com.cg.tdd.practice.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderValidatorTest {

    OrderValidator orderValidator;

    public static Stream<Arguments> priceTestData() {
        return Stream.of(
                Arguments.of(0.0, false),
                Arguments.of(-2.0, false),
                Arguments.of(1002.4, true),
                Arguments.of(242.5, true),
                Arguments.of(-242.5, false)
        );
    }

    @BeforeEach
    void init() {
        orderValidator = new OrderValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Laptop", "IPhone", "Printer", "Mic", "Keyboard"})
    void shouldCheckValidateProductNames(String productName) {
        assertTrue(orderValidator.isValidProductName(productName));

    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "Abcdefghjiklompqrstvuwxyzabcdefghi"})
    void shouldCheckInvalidProductNames(String productName) {
        assertFalse(orderValidator.isValidProductName(productName));
    }

    @ParameterizedTest
    @CsvSource({
            "1,true", "2,true", "3,true",
            "4,true", "4,true", "5,true",
            "6,true", "7,true", "8,true",
            "9,true", "10,true",
            "0,false", "11,false"
    })
    void shouldCheckValidAndInvalidQuantity(int quantity, boolean expected) {
        assertEquals(expected, orderValidator.isValidQuantity(quantity));
    }

    @ParameterizedTest
    @MethodSource("priceTestData")
    void shouldCheckValidAndInvalidPrice(double price, boolean expected) {
        assertEquals(expected,orderValidator.isValidPrice(price));
    }

    @ParameterizedTest
    @CsvSource({
            "PENDING, true",
            "CONFIRMED, true",
            "SHIPPED, true",
            "DELIVERED, true",
            "CANCELLED, true",
            "ORDERED, false"
    })
    void shouldCheckValidAndInvalidOrderStatus(String status, boolean expected){
        assertEquals(expected, orderValidator.isValidStatus(status));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
           "  ",
            "\t",
            "\n"
    })
    void shouldValidateBlank(String value){
        assertTrue(orderValidator.isBlank(value));
    }
}
