package com.cg.InterviewPreparation;

import java.util.Arrays;

public class AddNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "XCD3AFK5B"; // Output : ABCDFKX9

		//String output = "";

		StringBuilder sb = new StringBuilder();

		char[] charArray = str.toCharArray();

		int sum = 0;

		Arrays.sort(charArray);
		// System.out.println(charArray);

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				sum += Character.getNumericValue(charArray[i]);
			} else {
				sb.append(charArray[i]);
				//output += charArray[i];
			}
		}

		if (sum != 0) {
			System.out.println(sb + Integer.toString(sum));
		} else {
			System.out.println(sb);
		}
		
	
		
		
	}

}
