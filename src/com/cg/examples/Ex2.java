package com.cg.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(12, 45, 4, 76, 17, 91, 11);

		// numbers.stream().forEach(System.out::println);

		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		System.out.println(numbers.stream().map(x -> x * x).collect(Collectors.toList()));

		System.out.println(numbers.stream().reduce(0, (x, y) -> x + y));
		
		System.out.println(numbers.stream().reduce(Integer::sum).get());

	}

}
