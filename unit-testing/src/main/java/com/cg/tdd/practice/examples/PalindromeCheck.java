package com.cg.tdd.practice.examples;

public class PalindromeCheck {

    public boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

    // Better approach
    public boolean isPalindrome_1(String str) {
        StringBuilder reverse= new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.contentEquals(reverse);
//        return str.equals(reverse.toString());
    }
}
