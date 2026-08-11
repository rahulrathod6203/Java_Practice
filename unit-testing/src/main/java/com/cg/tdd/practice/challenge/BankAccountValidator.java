package com.cg.tdd.practice.challenge;

public class BankAccountValidator {
    boolean isValidAccountHolderName(String name) {
        return name.length() >= 3 && name.length() <= 20;
    }
}
