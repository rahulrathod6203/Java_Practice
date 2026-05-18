package com.cg.Map;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String email;
	private long salary;
	private List<String> phones;
	
	

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Customer(int id, String name, String email, long salary, List<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", phones="
				+ phones + "]";
	}

	

}
