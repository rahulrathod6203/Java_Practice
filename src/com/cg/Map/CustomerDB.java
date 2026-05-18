package com.cg.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {

	public static List<Customer> getAll() {
		return Stream
				    .of(new Customer(111, "Rahul", "rahul@gmail.com",30000, Arrays.asList("1234", "5678")),
						new Customer(107, "Anand", "anand@gmail.com",20000, Arrays.asList("0987", "3423")),
						new Customer(103, "Karan", "karan@gmail.com",40000, Arrays.asList("424242", "448484")),
						new Customer(125, "Mahesh", "mahesh@gmail.com",10000, Arrays.asList("314141", "431341")))
				.collect(Collectors.toList());

	}

}
