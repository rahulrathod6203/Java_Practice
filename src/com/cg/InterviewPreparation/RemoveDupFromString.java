package com.cg.InterviewPreparation;

public class RemoveDupFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";

		StringBuilder sb = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					repeated = true;
					break;

				}

			}

			if (!repeated) {
				sb.append(charArray[i]);
			}

		}
		System.out.println(sb);
		
	}

}
