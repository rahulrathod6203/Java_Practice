package com.cg.Java8;

import java.util.function.Consumer;

interface ConsumerI {

	void display();
}

public class ConsumerDemo {

	public static void main(String[] args) {

		// Takes an input ,but returns nothing
		Consumer<Integer> consumerI = t -> System.out.println("Displaying..." + t);

		consumerI.accept(10);

		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Raj!!");
		System.out.println(Thread.currentThread().getName());

	}

}
