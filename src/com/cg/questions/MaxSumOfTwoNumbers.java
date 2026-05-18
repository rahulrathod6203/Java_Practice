package com.cg.questions;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MaxSumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method-1
		int[] arr = { 2, 5, 1, 7, 3, 15,21 };

		int max1 = arr[0]; // 2 / 7
		int max2 = arr[1]; // 5 / 

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] > max1) {
				max2 = max1; //2
				max1 = arr[i];//7

			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		
		int maximum1=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>maximum1) {
				maximum1=arr[i];
			}
		}
		System.out.println("Max 1 : "+maximum1);

		// System.out.println(max1 + " " + max2);

		// Method-2

		int max = 0;

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}

//		System.out.println(max);

		NavigableSet<Integer> numbers = new TreeSet<>();
		for (int a : arr) {
			numbers.add(a);
		}
		
		System.out.println(numbers);

		int maximum = numbers.pollLast();

		int secondMax = numbers.lower(maximum);
		
		System.out.println(numbers.higher(21));

		//System.out.println(secondMax);
		
		System.out.println(maximum+secondMax);
		
		

	}

}
