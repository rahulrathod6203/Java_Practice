package com.cg.tdd.practice.examples;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by Zero!");
        }
        return a / b;
    }

    public boolean isPositive(int number) {
        return (number > 0) ? true : false;
    }
}