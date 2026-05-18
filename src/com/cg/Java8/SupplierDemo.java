package com.cg.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

	public static void main(String[] args) {

		// When there is no input but the output is expected..
		Supplier<String> supplier = () -> "Hi Supplier..";
		
		List<String> list=Arrays.asList();
		
		System.out.println(list.stream().findAny().orElseGet(supplier));

	}

}
