package com.cg.Java8.stream;

import java.util.Comparator;
import java.util.List;

public class MainApp {
	
	public static void main(String[] args) {
		
		List<Employee> employees=Database.allEmployees();
	
		// employees.stream().filter(emp->emp.getSalary()>20000).forEach(t->System.out.println(t));
		
		// employees.stream().sorted((o1,o2)-> (int) (o1.getSalary()-o2.getSalary())).forEach(s->System.out.println(s));
		
		// employees.stream().sorted(Comparator.comparing(emp->emp.getName())).forEach(System.out::print);
		
		// Increasing Order
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(name->System.out.println(name));
		
		// Decreasing Order
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(name->System.out.println(name));
		
		
		
	}

}
