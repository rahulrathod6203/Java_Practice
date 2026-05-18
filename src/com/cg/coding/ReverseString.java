package com.cg.coding;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Rahul";

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {

			// sb.append(str.charAt(i));

		}

		// System.out.println(sb);

		int num = 1234;

		String str1 = Integer.toString(num); // String str1=String.ValueOf(num);
	
		for (int i = str1.length() - 1; i >= 0; i--) {

			sb.append(str1.charAt(i));

		}

		System.out.println(sb);

	}

}
