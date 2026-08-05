package com.cg.old.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ConvertMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		List<Entry<Integer, String>> collect = map.entrySet().stream().collect(Collectors.toList());

		System.out.println(collect);

		int valueToFind = 4;

		String value = collect.stream().filter(entry -> entry.getKey() == valueToFind).map(Map.Entry::getValue)
				.findFirst().orElse("Not found");

		
		for(Entry<Integer, String> entry : collect) {
			
			if(entry.getKey()==valueToFind) {
				System.out.println(entry.getValue());
			}
		}
		

		//System.out.println(value);
	}

}
