package com.cg.Java8;

interface Calculator {
	void calc();
}

public class CalculatorImpl {

	public static void main(String[] args) {

		Calculator calculator = () -> {
			System.out.println("Calculating...");

		};
		
		calculator.calc();

	}

}
 