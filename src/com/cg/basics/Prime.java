package com.cg.basics;

import java.util.stream.IntStream;

public class Prime {

	public static boolean isPrime(int number) {

		boolean prime = true;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(isPrime(23));
		
		// in java 8
		IntStream.range(2, 100).filter(Prime::isPrime).forEach(System.out::println);

	}

}
