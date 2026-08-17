package com.cg.tdd.practice.challenge;

public class OrderValidator {
    public boolean isValidProductName(String productName) {
        return productName.length() >= 3 && productName.length() <= 30;
    }

    public boolean isValidQuantity(int quantity) {
        return quantity >= 1 && quantity <= 10;
    }

    boolean isValidPrice(double price) {
        return price > 0.0;
    }

    boolean isValidStatus(String status) {
        return status.equalsIgnoreCase("PENDING") || status.equalsIgnoreCase("CONFIRMED") ||
                status.equalsIgnoreCase("SHIPPED") || status.equalsIgnoreCase("DELIVERED") ||
                status.equalsIgnoreCase("CANCELLED");
    }

    boolean isBlank(String value) {
        return value ==null || value.isBlank();
    }
}
