package com.cg.Programming.employee;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	private String name;
	
	private int id;
	
	private LocalDate dob;
	
	private LocalDate doj;
	
	private String project;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Employee(String name, int id, LocalDate dob, LocalDate doj, String project) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.doj = doj;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dob=" + dob + ", doj=" + doj + ", project=" + project + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(dob, doj, id, name, project);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(dob, other.dob) && Objects.equals(doj, other.doj) && id == other.id
//				&& Objects.equals(name, other.name) && Objects.equals(project, other.project);
//	}
	
	

}
