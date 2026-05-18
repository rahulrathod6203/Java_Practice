package com.cg.Java8.stream;

public class Employee {
	
	public Employee(int id, String name, String role, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	private int id;
	
	private String name;
	
	private String role;
	
	private long salary;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
