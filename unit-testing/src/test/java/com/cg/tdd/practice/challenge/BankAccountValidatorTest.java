package com.cg.tdd.practice.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountValidatorTest {

    BankAccountValidator accountValidator;

    @BeforeEach
    void init(){
        accountValidator =  new BankAccountValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Rahul","John Doe","Priya123"})
    void shouldTestValidAccountHolderName(String name){
        assertTrue(accountValidator.isValidAccountHolderName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ra","ABCDEFGHIJKLMNOPQRSTUVWXYZ"})
    void shouldTestInValidAccountHolderName(String name){
        assertFalse(accountValidator.isValidAccountHolderName(name));
    }

}
