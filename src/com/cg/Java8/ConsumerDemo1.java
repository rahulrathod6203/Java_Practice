package com.cg.Java8;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<String> consumer = t -> System.out.println(t.toUpperCase());
		
		consumer.accept("rahul");
		
		

	}
}
