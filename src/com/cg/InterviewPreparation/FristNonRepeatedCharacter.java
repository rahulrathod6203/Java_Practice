package com.cg.InterviewPreparation;

public class FristNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AABBAACXD";

		for (int i = 0; i < str.length(); i++) {

			boolean repeated = false;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
