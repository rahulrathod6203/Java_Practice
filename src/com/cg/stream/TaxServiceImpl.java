package com.cg.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TaxServiceImpl implements TaxService {

	public List<Employee> evaluateTax() {
		// TODO Auto-generated method stub
		return Database.getEmployees()
									.stream()
									.filter(emp -> emp.getSalary() > 20000)
									.collect(Collectors.toList());
	}

	public List<String> getEmployeeNames() {
		return Database.getEmployees()
									.stream()
									.filter(emp -> emp.getSalary() > 20000)
									.map(name -> name.getName())
									.collect(Collectors.toList());
	}

}
