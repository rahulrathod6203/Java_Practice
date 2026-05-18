package com.cg.Java8;

@FunctionalInterface
interface funcInterface {

	void display();

}

public class Lambda {

	public static void main(String[] args) {

		funcInterface interface1 = () -> System.out.println("Displaying..");

		interface1.display();
	}

}
