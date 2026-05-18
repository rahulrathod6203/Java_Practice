package com.cg.stream;

import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {

		TaxServiceImpl obj = new TaxServiceImpl();

//		System.out.println(obj.evaluateTax());
//
//		System.out.println(obj.getEmployeeNames());

		Employee employee1 = new Employee(101, "Rahul", "rahul@gmail.com", 1000);
		Employee employee2 = new Employee(101, "Rahul", "rahul@gmail.com", 1000);
		
		Set<Employee> e1=new HashSet<>();
		
		e1.add(employee1);
		e1.add(employee2);
		
		System.out.println(employee1==employee2);
		System.out.println(employee1.equals(employee2));
		
		e1.stream().forEach(System.out::println);
	}

}
