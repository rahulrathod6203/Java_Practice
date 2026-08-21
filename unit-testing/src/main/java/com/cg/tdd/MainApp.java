package com.cg.tdd;

import com.cg.tdd.practice.fizzbuzz.FizzBuzz;

public class MainApp {

    public static void main(String[] args) {
        for (int i=0 ; i<=100 ; i++){
            System.out.println(FizzBuzz.compute(i));
        }
    }
}
