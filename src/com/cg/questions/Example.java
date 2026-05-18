package com.cg.questions;

import java.util.ArrayList;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>(10000);
		
		for(int i=1; i<10000 ; i++) {
			list1.add(i);
		}
		
		List<Integer> list2=new ArrayList<>();
		
		// for loop
		for(int i=1; i<10000 ; i++) {
			list1.add(i);
		}
		
		
		
		
	}

}
