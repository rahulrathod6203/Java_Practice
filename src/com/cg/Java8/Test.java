package com.cg.Java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {

		Consumer<Integer> consumer = t -> System.out.println("Printing :" + t);
		consumer.accept(10);

		BiConsumer<Integer, String> biConsumer = (x, y) -> {
			System.out.println(x + " " + y);
		};
		
		biConsumer.accept(96, "Rahul");
		
		
	}

}