package com.cg.coding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionDemoTest {

    AdditionDemo demo = new AdditionDemo();

    @Test
    void shouldTestAdditionOfTwoNumbers() {
        int expected = 15;
        int actual = demo.add(10, 5);
        assertEquals(expected, actual, "10+5 must equal 15");
        //assertNotEquals(expected,actual,"10+5 must not equals 14");
    }

    @Test
    void shouldTestgreaterOfTwoNumbers() {
        int actual = demo.greaterOfTwoNumbers(10, 20);
        int expected = 20;
        assertEquals(expected,actual , "The greater number should be 20.");
    }

    @Test
    void shouldRetrunFirstNumberWhenItsLargest_1() {
        int actual = demo.greaterOfTwoNumbers(20, 10);
        int expected = 20;
        assertEquals(expected,actual , "The greater number should be 20.");
    }

    @Test
    void shouldRetrunFirstNumberWhenItsLargest() {
        assertEquals(30, demo.greaterOfThreeNumbers(30, 13, 19));
    }

    @Test
    void shouldRetrunSecondNumberWhenItsLargest() {
        assertEquals(30, demo.greaterOfThreeNumbers(13, 30, 19));
    }

    @Test
    void shouldRetrunThirdNumberWhenItsLargest() {
        assertEquals(30, demo.greaterOfThreeNumbers(19, 13, 30));
    }

    @Test
    void shouldHandleEqualNumbers() {
        assertEquals(30, demo.greaterOfThreeNumbers(19, 30, 30));
        assertEquals(30, demo.greaterOfThreeNumbers(30, 19, 30));
        assertEquals(30, demo.greaterOfThreeNumbers(30, 30, 13));
    }


    @Test
    void shouldHandleNegativeNumbers(){
        assertThrows(IllegalArgumentException.class,
                () -> demo.greaterOfThreeNumbers(30,-10,20));
    }

}