package com.cg.questions;

import java.util.ArrayList;
import java.util.List;

public class NamesNotHavingLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = List.of("Rahul Rathod", "Yallaing", "Shashikant");

		List<String> namesNotHavingLastName = new ArrayList<>();

		for (String name : names) {
			String[] splitedName = name.split(" ");

			if (splitedName.length == 1) {
				namesNotHavingLastName.add(name);
			}
		}

		namesNotHavingLastName.stream().forEach(System.out::println);
		
		
	}

}
