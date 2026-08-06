package com.cg.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // Return "Fizz" if the number is divisible by 3
    @Test
    @DisplayName("Test for divisible by Three")
    @Order(2)
    void shouldTestNumberDivisibleByThree(){
        String actual = FizzBuzz.compute(3);
        assertEquals("Fizz",actual);
    }

    // Return "Buzz" if the number is dvisible by 5
    @Test
    @DisplayName("Test for divisible by Five")
    @Order(3)
    void shouldTestNumberDivisibleByFive(){
        String actual = FizzBuzz.compute(5);
        assertEquals("Buzz",actual);
    }

    // Return "FizzBuzz" if the number is devisible by 3 and 5
    @Test
    @DisplayName("Test for divisible by Three and five")
    @Order(1)
    void shouldTestNumberDivisibleByThreeAndFive(){
        String actual = FizzBuzz.compute(15);
        assertEquals("FizzBuzz",actual);
    }

    // Retrun the number if not divisible by 3 or 5
    @Test
    @DisplayName("Test for not divisible by Three or five")
    @Order(4)
    void shouldTestNumberNotDivisibleByThreeOrFive(){
        String actual = FizzBuzz.compute(1);
        assertEquals("1",actual);
    }

    @DisplayName("Test Data from a CSV file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void shouldTestDataFromCSVFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }
}
