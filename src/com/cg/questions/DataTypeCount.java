package com.cg.questions;

import java.util.ArrayList;
import java.util.List;

public class DataTypeCount {
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		list.add("Hello");
		list.add(42);
		list.add(42);
		list.add(3.14f);
		list.add("World");
		list.add(123);
		list.add(3.14);

		int stringCount = 0;
		int integerCount = 0;
		int floatCount = 0;

		for (Object obj : list) {
			if (obj instanceof String) {
				stringCount++;
			} else if (obj instanceof Integer) {
				integerCount++;
			} else if (obj instanceof Float) {
				floatCount++;
			}
		}

		// Determine which data type has the greatest count
		if (stringCount > integerCount && stringCount > floatCount) {
			System.out.println("String has the greatest count");
		} else if (integerCount > stringCount && integerCount > floatCount) {
			System.out.println("Integer has the greatest count");
		} else if (floatCount > stringCount && floatCount > integerCount) {
			System.out.println("Float has the greatest count");
		} else {
			System.out.println("There is a tie or the list is empty");
		}
	}
}
