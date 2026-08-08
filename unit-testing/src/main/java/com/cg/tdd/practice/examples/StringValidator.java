package com.cg.tdd.practice.examples;

public class StringValidator {

    public boolean isBlank(String str) {
        return str == null || str.isBlank();
    }
}
