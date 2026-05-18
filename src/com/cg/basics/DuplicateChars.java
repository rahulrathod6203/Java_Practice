package com.cg.basics;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";

		StringBuilder sb = new StringBuilder();

		str.chars().distinct().forEach(c -> sb.append((char) c));

		System.out.println(sb);
		
		System.out.println("*********************************");
		
		char[] charArray = str.toCharArray();
		
		StringBuilder sb1 = new StringBuilder();
		
		
		for (int i = 0; i < charArray.length; i++) {
			boolean repeated=false;
			
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					repeated=true;
				}
			}
			if(!repeated) {
				sb1.append(charArray[i]);
				
			}
			
		}
		
		System.out.println(sb1);

	}

}
