package com.cg.old.InterviewPreparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurancesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahulrathod";

//		List<String> collect = Arrays.stream(str.split("")).collect(Collectors.toList());
//		
//		System.err.println(collect);

		HashMap<Character, Integer> res = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (Character c : charArray) {

			if (res.containsKey(c)) {

				res.put(c, res.get(c) + 1);
			} else {
				res.put(c, 1);
			}

		}

		System.out.println(res);

		// In java 8

		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().forEach(System.out::println);

	}
}
