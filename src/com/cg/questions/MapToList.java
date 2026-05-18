package com.cg.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		List<Entry<Integer, String>> list = map.entrySet().stream().collect(Collectors.toList());

		System.out.println(list);

		String value = list.stream().filter(entry -> entry.getKey().equals(4)).map(Map.Entry::getValue).findFirst()
				.orElse(null);

		// Without Java 8
		for (Entry<Integer, String> str : list) {
			
			if(str.getKey().equals(4)) {
				String value1=str.getValue();
				System.out.println(value1);
				break;
			}

		}

	}

}
