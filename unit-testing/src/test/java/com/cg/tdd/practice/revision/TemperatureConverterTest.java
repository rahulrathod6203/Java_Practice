package com.cg.tdd.practice.revision;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    TemperatureConverter converter ;

    @BeforeEach
    void init(){
        converter =  new TemperatureConverter();
    }

    @ParameterizedTest
    @CsvSource({"0, 32", "100, 212", "-40, -40", "37,98.6"})
    void shouldConvertCelsiusToFahrenheit(double celsius, double expected){
        assertEquals(expected,converter.celsiusToFahrenheit(celsius));
    }
}
