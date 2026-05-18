package com.cg.questions;

import java.util.List;

public class MaxLengthOfStringFromList {

	public static String maxLength(List<String> list) {

		int maxLen = 0;
		String maxLengthString = "";

		for (String str : list) {
			int length = str.length();
			if (length > maxLen) {
				maxLen = length;
				maxLengthString = str;
			}
		}

		return maxLengthString;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = List.of("Rahul", "Roshan", "Pooja", "Walmik", "Yalling", "Shashikant");
		
		
		System.out.println(maxLength(list));

	}

}
