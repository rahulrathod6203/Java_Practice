package com.cg.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {

		// Conditional Check.. returns boolean
		// Predicate<Integer> predicate = t -> t % 2 == 0;

		// System.out.println(predicate.test(30));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t));

		List<Integer> numbers = Arrays.asList(12, 34, 23, 27, 56, 87, 99, 25);

		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		oddNumbers.forEach(t->System.out.println(t));
		
	}

}
