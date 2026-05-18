package com.cg.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HelloWorld {

	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld.i = HelloWorld.i + 10;
		
		HelloWorld obj1 = new HelloWorld();
		
		HelloWorld.i = HelloWorld.i + 10;
		
		System.out.println(HelloWorld.i);
		
		System.out.println(HelloWorld.i);

		List<Integer> list = Arrays.asList(1, 2);
		Stream<Integer> st = list.stream();

		st.filter(x -> x % 2 == 1).forEach(x -> System.out.println(x));
		st.filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

	}

}
