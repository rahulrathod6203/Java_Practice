package com.cg.coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";

		// Approach -1 using Java 8

		StringBuilder sb1 = new StringBuilder();

		str.chars().distinct().forEach(c -> sb1.append((char) c));

		System.out.println(sb1);
		

		// Approach - 2 Using CharArray...

		StringBuilder sb = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					repeated = true;
				}
			}
			
			if(!repeated) {
				sb.append(charArray[i]);
			}
			
		}
		System.out.println(sb);
		
		
		
		// Approach -3 Using Set Interface..
		
		StringBuilder sb3=new StringBuilder();
		
		Set<Character> str1=new LinkedHashSet<>();
		
		for(int i=0; i<str.length();i++) {
			str1.add(str.charAt(i));
		}
		
		for(Character c:str1) {
			sb3.append(c);
		}
		
		System.out.println(sb3);

	}

}
