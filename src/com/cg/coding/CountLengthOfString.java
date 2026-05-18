package com.cg.coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountLengthOfString {

	public static void main(String[] args) {

		String str = "Rahul";

		// In Java-8
		Long collect = Arrays.stream(str.split("")).collect(Collectors.counting());

		System.out.println("Length of the String is: " + collect);

		int characterCount = 0, spaceCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				characterCount += 1;
			}

			if (str.charAt(i) == ' ') {
				spaceCount += 1;
			}

		}
		 System.out.println("No. of Characters :" + characterCount + " \n" + "No. of Spaces :" + spaceCount);
	}

}
