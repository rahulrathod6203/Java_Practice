package com.cg.Programming.employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		// 1
//		// EmpDB.empData().stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
//		// EmpDB.empData().stream().sorted(Comparator.comparing(Employee::getDob).reversed()).forEach(System.out::println);
//
//		// 2
//		List<Employee> empData = EmpDB.empData();
//		// empData.stream().distinct().forEach(System.out::println);
//
//		// 3
//		int counts = 0;
//
//		for (Employee emp : empData) {
//			if (emp.getProject().equals("HSBC")) {
//				// System.out.println(emp);
//				// count++;
//			}
//
//		}
//		System.out.println(counts);
//
//		Set<Employee> distinctEmp = new HashSet<>(empData);
//		for (Employee em : distinctEmp) {
//			if (em.getProject().equals("HSBC")) {
//				// System.out.println(em);
//				// count++;
//			}
//		}
//
//		// Convert List into Map Before Java 8
//		Map<Employee, Integer> empMap = new HashMap<>();
//
//		for (Employee emp : empData) {
//			empMap.put(emp, emp.getId());
//		}
//
//		// System.out.println(empMap);
//
//		// In Java 8
//
//		Map<Integer, Employee> eMap = empData.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
//		//System.out.println(eMap);
//
//		// 3
//
//		Map<String, Integer> projectCount = new HashMap<>();
//
//		for (Employee employee : empData) {
//
//			String project = employee.getProject();
//			
//			if (projectCount.containsKey(project)) {
//				int count = projectCount.get(project);
//				//System.out.println(count);
//				projectCount.put(project, count + 1);
//			} else {
//				projectCount.put(project, 1);
//			}
//		}
//
//		for (Map.Entry<String, Integer> entry : projectCount.entrySet()) {
//			System.out.println(entry.getValue() + "=" + entry.getKey());
//		}
		
		
		EmpDB.empData().stream().forEach(System.out::println);
		
	}

}
