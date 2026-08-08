package com.cg.tdd.practice.challenge;

public class UserInputValidator {

    boolean isValidUsername(String username) {

        if (username.length() >= 3 || username.length() <= 15) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            if (!(Character.isDigit(username.charAt(i)) || Character.isAlphabetic(username.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    boolean isValidAge(int age) {
        return (age >= 18 && age <= 60) ? true : false;
    }

    boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return true;
    }

    boolean isBlank(String value) {
        if (value == null || value.isBlank()) {
            return true;
        }
        return false;
    }
}
