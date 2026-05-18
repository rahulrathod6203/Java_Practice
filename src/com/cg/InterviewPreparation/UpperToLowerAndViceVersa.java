package com.cg.InterviewPreparation;

public class UpperToLowerAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ThIs is a SimPlE sTRING";

		// char[] charArray = str.toCharArray();

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}

			else if (Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println(sb);

	}

}
