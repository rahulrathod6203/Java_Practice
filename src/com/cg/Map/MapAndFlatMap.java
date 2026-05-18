package com.cg.Map;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {

		List<Customer> customers = CustomerDB.getAll();
		
		// Converting List<Customers> to List<String> -> Data transformation
		// customer -> customer.getEmail -> mapping
		// one customer -> one email -> One-to-one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		// We get stream of streams. Not a good practice.
		List<List<String>> phone = customers
											.stream().map(customer -> customer.getPhones())
											.collect(Collectors.toList());
		System.out.println("Map :" +phone);
		
		
		// Converting List<Customers> to List<String> -> Data transformation
		// customer -> customer.getPhones() -> mapping
		// one customer -> many Phone numbers -> One-to-many mapping
		List<String> phone1 = customers
									   .stream()
									   .flatMap(customer -> customer.getPhones().stream())
									   .collect(Collectors.toList());
		System.out.println("FlatMap : "+phone1);
		
		
		List<String> ema=customers.stream().map(email->email.getEmail().toUpperCase()).collect(Collectors.toList());
		System.out.println(ema);
		
		Long totalSalary=customers.stream().map(emp->emp.getSalary()).reduce(Long::sum).get();
		System.out.println(totalSalary);
		
		customers.stream().sorted(Comparator.comparing(Customer::getId)).forEach(sort->System.out.println(sort));
	
	}

}
