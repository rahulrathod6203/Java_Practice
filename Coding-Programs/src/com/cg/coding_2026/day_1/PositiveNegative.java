package com.cg.coding_2026.day_1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        String logic = """
                if number less than 0
                    print negative
                if number greater than 0
                    print positive
                if number is equal to 0
                    print Zero
                """;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("It's a nagative number!");
        } else if (number>0) {
            System.out.println("It's a positive number!");
        }else {
            System.out.println("The number is Zero!");
        }
    }
}
