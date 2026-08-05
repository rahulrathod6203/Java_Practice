package com.cg.coding_2026.day_1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // Write a program to find if a given number is Even/Odd.
        String logic = """
                Even -> If the remainder is 0
                Odd -> If the remainder is not 0
                
                if number is not a digit:
                    print "Invalid Input"
                if number is even:
                    print "Even"
                else:
                    print "Odd"
                """;

        // Take the input from the user
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number:");
        while(true) {
            if(scanner.hasNextInt()){
                number= scanner.nextInt();
                if(number == 0){
                    System.out.println("Please enter a valid number:");
                }else{
                    break;
                }
            }else{
                System.out.println("Please enter a valid number:");
                scanner.next();
            }
        }

        if (number % 2 == 0) {
            System.out.println("The entered number-" + number + " is a even number.");
        } else {
            System.out.println("The entered number-" + number + " is a odd number.");
        }
    }
}
