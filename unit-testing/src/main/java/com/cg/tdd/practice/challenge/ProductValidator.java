package com.cg.tdd.practice.challenge;

public class ProductValidator {
    public boolean isValidProductName(String productName) {
        if (productName.length() >= 3 && productName.length() <= 30 && !(productName.isBlank())) {
            return true;
        }
        return false;
    }

    public boolean isValidPrice(double price) {
        return price >= 1.0;
    }

    public boolean isValidQuantity(int quantity) {
        return quantity >= 1 && quantity <= 100;
    }

    public boolean isValidCategory(String category) {
        if(category==null || category.isBlank()){
            return false;
        }
        if (category.equals("Unknown")) {
            return false;
        }
        if(Character.isDigit(category.charAt(0))){
            return false;
        }
        if (Character.isUpperCase(category.charAt(0))) {
            return true;
        }

        return false;
    }

    public boolean isBlank(String value) {
        return value ==null || value.isBlank();

    }
}
