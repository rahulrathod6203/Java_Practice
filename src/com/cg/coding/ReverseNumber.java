package com.cg.coding;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;

		int rem, reversed = 0;

		while (num != 0) {

			rem = num % 10;
			reversed = reversed * 10 + rem;
			num = num / 10;

		}

		System.out.println(reversed);

	}

}
