package com.cg.Programming.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpDB {

	public static List<Employee> empData() {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rahul", 101, LocalDate.of(1997, 07, 21), LocalDate.of(2021, 04, 15), "HSBC"));
		employees.add(new Employee("Rahul", 101, LocalDate.of(1997, 07, 21), LocalDate.of(2021, 04, 15), "HSBC"));
		employees.add(new Employee("Walmik", 107, LocalDate.of(1996, 03, 16), LocalDate.of(2022, 07, 21), "PL/SQL"));
		employees.add(new Employee("Roshan", 104, LocalDate.of(1998, 10, 21), LocalDate.of(2020, 04, 30), "CITI"));
		employees.add(new Employee("Rahul", 102, LocalDate.of(1997, 07, 21), LocalDate.of(2021, 04, 15), "HSBC"));
		employees.add(new Employee("Pooja", 103, LocalDate.of(1997, 07, 21), LocalDate.of(2023, 02, 20), "DISCOVER"));
		
		return employees;
	}

}
