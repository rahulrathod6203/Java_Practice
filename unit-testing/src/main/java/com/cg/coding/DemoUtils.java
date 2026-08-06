package com.cg.coding;

public class DemoUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int greaterOfTwoNumbers(int a, int b) {
        if (a >= b) {
            return a;
        } else return b;
    }

    public int greaterOfThreeNumbers(int a, int b, int c) {
        if(a<=0 || b<=0 || c<=0){
            throw new IllegalArgumentException("Number cannot be zero or neagtive!!");
        }
        if (a >= b && a >= c) {
            return a;
        } else if(b >=a && b >= c){
            return b;
        }else return c;
    }

}
