package com.cg.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(12, 37, 17, 32, 10, 54, 33, 42);

		// numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);//
		// even numbers

		// numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);//
		// odd numbers

		List<String> courses = Arrays.asList("Java", "Spring Boot", "API", "Microservices", "Azure", "Spring", "AWS",
				"Docker");

		// courses.stream().forEach(course->System.out.println(course));

		// courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);

		// courses.stream().filter(course -> course.length()
		// >=4).forEach(System.out::println);

		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);

		int total = numbers.stream().reduce(Integer::sum).get();
		System.out.println("Sum is: " + total);

		int maxValue = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxValue);

		int minValue = numbers.stream().reduce(Integer::min).get();
		System.out.println(minValue);

		System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));

		List<Integer> ascending = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(ascending);

		List<Integer> descending = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descending);

	}

}
