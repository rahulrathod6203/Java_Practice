package com.cg.basics;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20, res = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");

		char op = sc.next().charAt(0);

		switch (op) {

		case '+':
			res = num1 + num2;
			System.out.println(res);
			break;

		case '-':
			res = num1 - num2;
			System.out.println(res);
			break;

		case '*':
			res = num1 * num2;
			System.out.println(res);
			break;

		case '/':
			res = num1 / num2;
			System.out.println(res);
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
