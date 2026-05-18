package com.cg.coding;

public class MaxMinArray {

	public static void main(String[] args) {

		int[] arr = { 12, 32, 43, 11, 2, 54, 88, 67, 54 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max and Min value from the array are  " +"MAX:"+ max+", MIN:"+min);

	}

}
