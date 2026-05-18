package com.cg.questions;

public class Test {

	static int num;

	public static int result(int a) {

		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(result(10));

		Test test = new Test();

		System.out.println(test.result(100));

		String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s.concat("Rahul"));
		System.out.println();

	}

}
