package com.cg.questions;

import java.util.HashMap;
import java.util.TreeMap;

public class OccurancesOfString {

	public static void main(String[] args) {

		String str = "This is a simple sentence. This is ";

		// For single characters...
		HashMap<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (Character c : charArray) {
			Integer integer = map.get(c);

			if (integer == null) {
				map.put(c, 1);
			} else {
				map.put(c, integer + 1);
			}

		}
		
		
	

		System.out.println(map);

		TreeMap<Character, Integer> treeMap = new TreeMap<>(map);

		System.out.println(treeMap);

		// Count the number of occurrences of Words in a String..

		HashMap<String, Integer> wordOccurances = new HashMap<>();

		String[] strArray = str.split(" ");

		for (String word : strArray) {
			Integer integer = wordOccurances.get(word);
			
			if(integer==null) {
				wordOccurances.put(word, 1);
			}else {
				wordOccurances.put(word, integer+1);
			}
		}
		
		System.out.println(wordOccurances);
	}

}
