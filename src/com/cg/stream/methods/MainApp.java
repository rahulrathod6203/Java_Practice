package com.cg.stream.methods;

import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {

		List<Course> allCourses = Database.allCourses();
		
		//allCourses.stream().forEach(System.out::println);
		
		System.out.println("*****************************");

		// anyMatch -> Takes an Predicate as argument
		//System.out.println(allCourses.stream().anyMatch(course -> course.getPrice() > 500));
		
		// allMatch
		//System.out.println(allCourses.stream().allMatch(course->course.getNoOfStudents()>10000));
		
		// noneMatch
		//System.out.println(allCourses.stream().noneMatch(course->course.getReviews()>10000));
		
		// sorted
		//allCourses.stream().sorted(Comparator.comparing(Course::getName).reversed()).forEach(System.out::println);
		
		// limit
		//allCourses.stream().limit(5).forEach(System.out::println);
		
		// skip
		// allCourses.stream().skip(3).forEach(System.out::println);
		
		// takeWhile
		//allCourses.stream().takeWhile(course->course.getPrice()>800).forEach(System.out::println);
		
		// dropWhile
		//allCourses.stream().dropWhile(course->course.getPrice()>800).forEach(System.out::println);
		
		// max
		//System.out.println(allCourses.stream().max(Comparator.comparing(Course::getNoOfStudents)));
		
		// min
		// System.out.println(allCourses.stream().min(Comparator.comparing(Course::getReviews)));
		
		// findAny
		//System.out.println(allCourses.stream().filter(course->course.getNoOfStudents()>40000).findAny());
		
		// findFirst
		//System.out.println(allCourses.stream().filter(course->course.getNoOfStudents()>40000).findFirst());
		
		// sum
		//System.out.println(allCourses.stream().mapToInt(course->course.getNoOfStudents()).sum());
		
		// average
		//System.out.println(allCourses.stream().mapToDouble(course->course.getNoOfStudents()).average());
		
		// count
		//System.out.println(allCourses.stream().mapToInt(course->course.getNoOfStudents()).count());
		
		// groupingBy
		System.out.println(allCourses.stream().collect(Collectors.groupingBy(Course::getPrice)));
		
		
		
	}

}
