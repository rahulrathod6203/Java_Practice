package com.cg.tdd.practice.examples;

public class CheckLeapYear {
    public static boolean check(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
