package com.cg.old.coding;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {

		String str = "defbca";

//		char[] str1 = str.toCharArray();
//		
//		Arrays.sort(str1);
//		
//		System.out.println(str1);

		char[] charArray = str.toCharArray();

		char temp;

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				
				if (charArray[j] > charArray[i]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		
		System.out.println(charArray);
		
		
		String numberString="8273247264721";
		
		char[] numArray = numberString.toCharArray();
		
		Arrays.sort(numArray);
		System.out.println(numArray);
		
		
		Long num=43423423595883L;
		
		String longString=Long.toString(num);
		
		
		
		
		char[] charArray2 = longString.toCharArray();
		
		Arrays.sort(charArray2);
		
		System.out.println(charArray2);
		
	
	}

}
