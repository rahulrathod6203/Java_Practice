package com.cg.coding;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static boolean checkPrime(int number) {

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
		
		List<Integer> primeNumbersList=new ArrayList<>();

		for (int i = 1; i < 100; i++) {
			if(checkPrime(i)) {
				primeNumbersList.add(i);
			}
			
		}
		
		System.out.println(primeNumbersList);

	}

}
