package com.cg.coding;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	// Fibonacci : next number will be the sum of previous two numbers

	public List<Integer> fibbonacci() {

		List<Integer> fibbSeries = new ArrayList<>();

		int n1 = 0, n2 = 1, n3;

		for (int i = 2; i < 10; i++) {

			n3 = n1 + n2;
			fibbSeries.add(n3);
			n1 = n2;
			n2 = n3;
		}
		// adding 0 and 1 at 0th and 1st position respectively.
		fibbSeries.add(0, 0);
		fibbSeries.add(1, 1);
		return fibbSeries;
	}

	public static void main(String[] args) {

//		int firstNumber = 0;
//		int secondNumber = 1;
//		int nextNumber;
//
//		for (int i = 2; i < 10; i++) {
//			nextNumber = firstNumber + secondNumber;
//			System.out.println(nextNumber);
//			firstNumber = secondNumber;
//			secondNumber = nextNumber;
//		}

		Fibonacci fibbObj = new Fibonacci();
		System.out.println(fibbObj.fibbonacci());
	}

}
