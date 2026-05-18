package com.cg.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>(List.of(22, 77, 65, 23, 52));

		boolean isOdd = true;

		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());


		int oddIndex = 0;
		int evenIndex = 0;
		int size = numbers.size();

		for (int i = 0; i < size; i++) {
			if (isOdd) {
				System.out.print(oddNumbers.get(oddIndex) + ",");
				oddIndex++;
			} else {
				System.out.print(evenNumbers.get(evenIndex) + ",");
				evenIndex++;
			}
			isOdd = !isOdd;
		}

	}

}
