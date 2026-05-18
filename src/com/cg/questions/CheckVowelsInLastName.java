package com.cg.questions;

import java.util.ArrayList;
import java.util.List;

public class CheckVowelsInLastName {

	private static boolean isVowel(char c) {

		// return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = List.of("Rahul Rathod", "Yallaing ahanapur", "Shashikant Mirji");

		List<String> lastNamesStartingWithVowels = new ArrayList<>();

		for (String str : names) {

			String[] splitName = str.split(" ");
			String lastName = splitName[splitName.length - 1];
			
			char lastNameFirstChar = lastName.toLowerCase().charAt(0);
			
			if (isVowel(lastNameFirstChar)) {
				lastNamesStartingWithVowels.add(str);
			}

		}

		lastNamesStartingWithVowels.stream().forEach(System.out::println);

	}

}
