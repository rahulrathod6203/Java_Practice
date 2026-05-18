package com.cg.questions;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1, 50, 98, 105, 250);

		NavigableSet<Integer> numberSet = new TreeSet<>(numbers);

		Integer lowerClosest = numberSet.floor(200);
		Integer higherClosest = numberSet.ceiling(200);

//		System.out.println(lowerClosest);
//		System.out.println(higherClosest);

		if (lowerClosest == null) {
			System.out.println(higherClosest);
		}

		else if (higherClosest == null) {
			System.out.println(lowerClosest);
		} else {

			int lowerDifference=Math.abs(lowerClosest-200);
			int higherDifference=Math.abs(higherClosest-200);
			
			if(higherDifference<=lowerDifference) {
				System.out.println(higherClosest);
			}
			else {
				System.out.println(lowerClosest);
			}
			
		}
		

	}

}
