package com.cg.questions;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDDEFEFGGHH";

		List<Character> chars = new ArrayList<>();

		for (int i = 0; i < str.length() - 1; i++) {

			char currentChar = str.charAt(i);
			char nextChar = str.charAt(i + 1);

			if (currentChar == nextChar && !chars.contains(currentChar)) {

				chars.add(currentChar);
			}
		}

		System.out.println(chars);
	}

}
