package com.cg.old.basics;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean res = false;

		for (int i = 1; i < 100; i++) {

			res = i % 2 == 0 ? true : false;
			
			if (res) {
				System.out.println(i + " -> even");
			} else {
				System.out.println(i + " -> oddd");
			}

		}

	}

}
