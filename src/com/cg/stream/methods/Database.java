package com.cg.stream.methods;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Course> allCourses() {

		List<Course> courses = new ArrayList<>();

		courses.add(new Course(1, "Java", 32000, 12000, 999));
		courses.add(new Course(2, "React", 52000, 42000, 999));
		courses.add(new Course(3, "API", 22000, 22000, 599));
		courses.add(new Course(4, "SpringBoot", 32000, 19000, 699));
		courses.add(new Course(5, "Microservices", 62000, 15000, 799));
		courses.add(new Course(6, "Docker", 82000, 11000, 1111));
		courses.add(new Course(7, "Kubernetes", 72000, 10000, 999));

		return courses;

	}

}
