package com.cg.coding;

public class VowelsAndConsonents {

	public static void main(String[] args) {

		String str = "This is a really simple sentence";  

		str = str.toLowerCase();
		
		int vowelCount = 0, consCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || 
				str.charAt(i) == 'e' || 
				str.charAt(i) == 'i' || 
				str.charAt(i) == 'o' || 
				str.charAt(i) == 'u') {
				
				vowelCount++;
				
			} else  {
				consCount ++;
			}
		}
		
		System.out.println("Vowels :" + vowelCount);
		System.out.println("Consonents :" + consCount);
	}

}
