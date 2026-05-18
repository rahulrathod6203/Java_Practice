package com.cg.Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
	
	
	public static List<Employee> allEmployees() {
		
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(101, "Rahul", "Software Engineer", 30000));
		employees.add(new Employee(102, "Deeepak", "Software Tester", 20000));
		employees.add(new Employee(103, "Prasad", "Data Engineer", 50000));
		employees.add(new Employee(104, "Vamsi", "DevOps Engineer", 70000));
		
		return employees;
		
	}

}
