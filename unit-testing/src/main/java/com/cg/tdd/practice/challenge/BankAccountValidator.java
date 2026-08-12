package com.cg.tdd.practice.challenge;

public class BankAccountValidator {
    boolean isValidAccountHolderName(String name) {
        return name.length() >= 3 && name.length() <= 20;
    }

    boolean isValidAge(int age) {
        return age >= 18 && age <= 60;
    }

    boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.length() != 10) {
            return false;
        }

        for (char ch : accountNumber.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;

    }

    boolean isBlank(String value){
        return value ==null || value.isBlank();
    }
}
