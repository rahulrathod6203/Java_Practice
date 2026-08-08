package com.cg.tdd.practice.examples;

public class GreaterOfThreeNumbers {
    public static int checkLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }
}
