package com.cg.InterviewPreparation;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Brag";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Not an Anagram...");
		} else {

			// Sort the string - 1

			char[] charArray1 = str1.toCharArray();

			char temp1;

			for (int i = 0; i < charArray1.length; i++) {
				for (int j = 0; j < charArray1.length; j++) {
					if (charArray1[j] > charArray1[i]) {
						temp1 = charArray1[i];
						charArray1[i] = charArray1[j];
						charArray1[j] = temp1;

					}
				}
			}
			
			System.out.println(charArray1);

			// Sort the string - 2

			char[] charArray2 = str2.toCharArray();
			

			char temp2;

			for (int i = 0; i < charArray2.length; i++) {
				for (int j = 0; j < charArray2.length; j++) {
					if (charArray2[j] > charArray2[i]) {
						temp2 = charArray2[i];
						charArray2[i] = charArray2[j];
						charArray2[j] = temp2;

					}
				}
			}
			
			System.out.println(charArray2);
			
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("Anagram");
			}
			
			else {
				System.out.println("Not an Anagram");
			}
			

		}

	}

}
