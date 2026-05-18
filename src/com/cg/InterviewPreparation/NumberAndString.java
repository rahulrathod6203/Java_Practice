package com.cg.InterviewPreparation;

public class NumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahul@*   $123";

		StringBuilder sb = new StringBuilder();

//		for (int i = 0; i < str.length(); i++) {
//
//			// only special characters...
//			if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && !(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
//				//sb.append(str.charAt(i));
//
//			}
//
//			// Only alpha.. Characters...
//			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
//				sb.append(str.charAt(i));
//
//			}
//		}
//
//		System.out.println(sb);
		
		
		// Using Character class methods..
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			// Only Digits...
			if((Character.isDigit(str.charAt(i)))) {
				System.out.print(str.charAt(i));
			}
			
			// Only Alphabets...
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
			
			// Other than Digits and Alphabets..
			if(!(Character.isDigit(str.charAt(i))) && !(Character.isAlphabetic(str.charAt(i)))) {
				System.out.print(str.charAt(i));
			}
			
			// number of spaces...
			if(Character.isWhitespace(str.charAt(i))) {
				count++;
				
			}
				
		}
		System.out.println(count);
		
		

	}

}
