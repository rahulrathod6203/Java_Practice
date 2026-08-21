package com.cg.tdd.practice.revision;

public class StringValidator {
    public boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    public boolean validatePassword(String password) {
        if (password == null || password.isBlank()) {
            return false;
        }

        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (Character.isLetter(password.charAt(i))) {
                hasLetter = true;
            }
        }

        return hasDigit && hasLetter;

    }
}
