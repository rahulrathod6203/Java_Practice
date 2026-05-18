package com.cg.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesRepeatedInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = List.of("Rahul", "Yallaling", "Shashikant", "Rahul", "Yallaling");

		HashMap<String, Integer> repeatedNames = new HashMap<>();

		// Without JAVA 8
		for (String name : names) {
			Integer integer = repeatedNames.get(name);
			if (integer == null) {
				repeatedNames.put(name, 1);
			} else {
				repeatedNames.put(name, integer + 1);

			}
		}

		//System.out.println(repeatedNames);

		// With Java 8
		Map<String, Long> collectMap = names.stream()
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		System.out.println(collectMap);

		//

		List<String> collect = repeatedNames.entrySet().stream().filter(value -> value.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(collect);

		List<String> collect2 = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(collect2);

	}

}
