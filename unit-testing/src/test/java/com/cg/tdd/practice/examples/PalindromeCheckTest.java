package com.cg.tdd.practice.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PalindromeCheckTest {

    PalindromeCheck palindromeCheck;

    @BeforeEach
    void init() {
        palindromeCheck = new PalindromeCheck();
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "refer", "level"})
    public void shouldCheckIfStringIsPalindrome(String str) {
        assertTrue(palindromeCheck.isPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"rahul", "priya", "roshan"})
    public void shouldCheckIfStringIsNotPalindrome_1(String str) {
        assertFalse(palindromeCheck.isPalindrome(str));
    }

    @ParameterizedTest
    @CsvSource({"madam,true", "level,true", "refer,true", "java,false"})
    void shouldCheckWhetherStringIsPalindrome(String str, boolean expected) {
        assertEquals(expected, palindromeCheck.isPalindrome(str));
    }

    public static Stream<Arguments> palindromeTestData() {
        return Stream.of(
                Arguments.of("mAdam", true), Arguments.of("refeR", true),
                Arguments.of("leVel",true), Arguments.of("Java",false),
                Arguments.of("Springboot",false)
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeTestData")
    void shouldCheckWhetherStringIsPalindromeIgnoreCase(String str, boolean expected) {
        assertEquals(expected,palindromeCheck.isPalindrome(str));
    }
}
