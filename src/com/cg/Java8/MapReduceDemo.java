package com.cg.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

import com.cg.Java8.stream.Database;

public class MapReduceDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 42, 34, 65, 71, 25, 78);

		int sum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);

		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		BinaryOperator<Integer> accumulator = Integer::sum;

		Integer sum2 = numbers.stream().reduce(accumulator).get();
		System.out.println(sum2);

		int maxValuve = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxValuve);

		int maxValue1 = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxValue1);

		Long sumSalary = Database.allEmployees().stream().filter(employee -> employee.getSalary() > 20000)
				.map(emp -> emp.getSalary()).mapToLong(i -> i).sum();

		System.out.println(sumSalary);
		
		
		// BiPredicate
		BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
		System.out.println(biPredicate.test(400, 200));
		
		
		// BiConsumer
		BiConsumer<Integer, String> biConsumer = (x, y) -> {
			System.out.println(x + " " + y);
		};
		biConsumer.accept(100, "HELLO");
		

		// BiFunction
		BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> {
			return x + y;
		};
		
		Integer res = biFunction.apply(100, 200);
		System.out.println(res);

	}

}
