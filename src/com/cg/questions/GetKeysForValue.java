package com.cg.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetKeysForValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 5);
		map.put(7, 2);
		map.put(3, 5);
		map.put(9, 5);
		map.put(4, 5);

		List<Integer> keys = new ArrayList<>();

		int valueToFindkeys = 5;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue().equals(valueToFindkeys)) {
				keys.add(entry.getKey());
			}

		}

		System.out.println("The keys for " + valueToFindkeys + " are " + keys);
		
		
		// Using Java 8
		List<Integer> keysForGivenValue = map.entrySet().stream()
				.filter(entry -> entry.getValue().equals(valueToFindkeys)).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(keysForGivenValue);
	}

}
