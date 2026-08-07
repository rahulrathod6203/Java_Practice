package com.cg.tdd.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EvenDemoTest {

    // check if the given number is even
    @Test
    void shouldTestNumberIsEven(){
        assertTrue(EvenDemo.isEven(4));
        assertFalse(EvenDemo.isEven(7));
    }

    @Test
    void shouldTestNegativeNumberIsEven(){
        assertTrue(EvenDemo.isEven(-4));
    }

    @ParameterizedTest(name = "Value={0}")
    @ValueSource(ints = {2,4,8,10,12})
    void shouldTestNumberIsEvenFromArray(int value){
        assertTrue(EvenDemo.isEven(value));
    }
}
