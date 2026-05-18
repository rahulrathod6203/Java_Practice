package com.cg.stream.methods;

public class Course {

	private int id;

	private String name;

	private int reviews;

	private int noOfStudents;

	private int price;

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

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Course(int id, String name, int reviews, int noOfStudents, int price) {
		super();
		this.id = id;
		this.name = name;
		this.reviews = reviews;
		this.noOfStudents = noOfStudents;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", reviews=" + reviews + ", noOfStudents=" + noOfStudents
				+ ", price=" + price + "]";
	}

}
