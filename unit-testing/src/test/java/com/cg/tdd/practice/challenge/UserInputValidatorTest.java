package com.cg.tdd.practice.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserInputValidatorTest {

    UserInputValidator inputValidator;

    @BeforeEach
    void init() {
        inputValidator = new UserInputValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"rahul123", "rahul", "java123", "user2026"})
    void shouldValidateUserName(String username) {
        assertTrue(inputValidator.isValidUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ra", "rahulrathodpunejinjewadi"})
    void shouldValidateUserNameLength(String username) {
        assertFalse(inputValidator.isValidUsername(username));
    }

    @ParameterizedTest
    @CsvSource({"18,true", "17,false", "24,true", "60,true", "64,false"})
    void shouldValidateAge(int age, boolean expected) {
        assertEquals(expected, inputValidator.isValidAge(age));

    }

    @ParameterizedTest
    @NullSource
    void shouldValidateNullEmail(String email) {
        assertFalse(inputValidator.isValidEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    void shouldValidateEmptyEmail(String email) {
        assertFalse(inputValidator.isValidEmail(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldValidateNullAndEmptyUsername(String username) {
        assertTrue(inputValidator.isBlank(username));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"\n", "\t", "  "})
    void shouldValidateWhitespaceUsername(String username) {
        assertTrue(inputValidator.isBlank(username));
    }

    // @CsvSource({,"'',true","'',true"})
    public static Stream<Arguments> inputEmailTestData() {
        return Stream.of(
                Arguments.of("rahul@gmail.com", true),
                Arguments.of("roshanyahoo.com", false),
                Arguments.of("pooja@live.com", true),
                Arguments.of("@live.com", false),
                Arguments.of("pooja@live.", false)
        );
    }

    @ParameterizedTest
    @MethodSource("inputEmailTestData")
    void shouldValidateInputEmail(String email, boolean expected) {
        assertEquals(expected, inputValidator.isValidEmail(email));
    }

}
