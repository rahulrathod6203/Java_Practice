package com.cg;

public class Basics {

	int id;

	String name;

	String email;

	public Basics(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public static void main(String[] args) {

		Basics basicsObj = new Basics(101, "Rahul", "rahul@gmail.com");

		System.out.println(basicsObj.id);

	}

}
