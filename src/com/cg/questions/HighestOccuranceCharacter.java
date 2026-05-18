package com.cg.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class HighestOccuranceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Yallaling Khanapur";
		
		
		HashMap<Character, Integer> map = new HashMap<>();

		char[] charArray = name.toCharArray();

		for (Character c : charArray) {

			Integer integer = map.get(c);
			if (integer == null) {
				map.put(c, 1);
			} else {
				map.put(c, integer + 1);
			}

		}
		
		// Java 8
		//System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getKey());
		
		
		
		//map.entrySet().stream().forEach(System.out::println);
		
		Optional<Entry<Character, Integer>> max = map.entrySet().stream().max(Map.Entry.comparingByValue());
		
		System.out.println(max.orElseThrow().getKey());
		
		String nameReverse="rahul";
		
		char[] arr=nameReverse.toCharArray();
		
				
		
	}
	

}
