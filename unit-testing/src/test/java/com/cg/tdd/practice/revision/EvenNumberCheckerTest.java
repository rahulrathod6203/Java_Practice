package com.cg.tdd.practice.revision;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberCheckerTest {

    EvenNumberChecker numberChecker ;
    AgeValidator ageValidator;
    StringValidator stringValidator;

    public static Stream<Arguments> passwordTestData() {
        return Stream.of(
                Arguments.of("Password1", true), Arguments.of("java1234", true),
                Arguments.of("short1", false), Arguments.of("12345678", false),
                Arguments.of("abcdefgh", false), Arguments.of(null, false),
                Arguments.of("", false)
        );
    }

    @BeforeEach
    void init(){
        numberChecker = new EvenNumberChecker();
        ageValidator  = new AgeValidator();
        stringValidator= new StringValidator();
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void shouldReturnTrueIfNumberIsEven(int number){
        assertTrue(numberChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    void shouldReturnFalseIfNumberIsNotEven(int number){
        assertFalse(numberChecker.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({
            "18, true", "17, false", "0, false", "19, true","-1, false"
    })
    void shouldCheckValidAgeForVoting(int age, boolean expected){
        assertEquals(expected, ageValidator.isEligibleToVote(age));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"  ", "\t", "\n"})
    void shouldValidateBlankValue(String value){
        assertTrue(stringValidator.isBlank(value));
    }

    @ParameterizedTest
    @MethodSource("passwordTestData")
    void shouldValidatePassword(String password, boolean expected){
        assertEquals(expected, stringValidator.validatePassword(password));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldValidateNullOrBlankPassword(String password){
        assertFalse(stringValidator.validatePassword(password));
    }



}