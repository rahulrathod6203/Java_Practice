package com.cg.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Database {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Akash", "akash@gmail.com", 23000));
		employees.add(new Employee(103, "Jay", "jay@gmail.com", 14000));
		employees.add(new Employee(104, "Prasad ", "prasad@gmail.com", 18000));
		employees.add(new Employee(107, "Yash", "yash@gmail.com", 90000));
		return employees;
	}

	// For Map Example sorting PRIMITIVE DATA TYPE
	public static Map<Integer, String> getEmp() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(110, "Bobby");
		map.put(113, "Yash");
		map.put(121, "Zendya");
		return map;

	}

	public static Map<Employee, Integer> getEmpMap() {
		
		Map<Employee, Integer> empMap = new TreeMap<Employee, Integer>();
		empMap.put(new Employee(101, "Akash", "akash@gmail.com", 23000), 10);
		empMap.put(new Employee(103, "Jay", "jay@gmail.com", 14000), 20);
		empMap.put(new Employee(104, "Prasad ", "prasad@gmail.com", 18000), 40);
		empMap.put(new Employee(107, "Yash", "yash@gmail.com", 90000), 70);
		return empMap;
	}

}
