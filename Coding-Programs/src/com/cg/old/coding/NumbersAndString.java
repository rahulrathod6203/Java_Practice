package com.cg.old.coding;

public class NumbersAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahul123";

		StringBuilder str2 = new StringBuilder(); // not synchronized | faster | not thread safe
		StringBuffer numbers = new StringBuffer(); // synchronized

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				str2.append(str.charAt(i));

			} else {
				numbers.append(str.charAt(i));
			}

		}

		System.out.println(str2);
		System.out.println(numbers);

	}

}
