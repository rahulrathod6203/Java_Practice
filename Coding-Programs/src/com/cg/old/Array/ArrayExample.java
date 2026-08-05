package com.cg.old.Array;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// for loop
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
		}

		// For each
		for (int a : arr) {
			// System.out.println(a);
		}
		
		
		// 2D Array.
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}

	}

}
