package com.cg.tdd.practice;

public class CheckNumber {

    public static String check(int i) {

        if(i>0){
            return "Positive";
        }
        if(i<0){
            return "Negative";
        }
        return "Zero";
    }
}
