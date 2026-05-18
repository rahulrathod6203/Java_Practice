package com.cg;

public class Practice {
	
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		int[] arr1= {12,34,54,13,24,33};
		
		String[] names=new String[5];
		
		names[0]="RAHUL";
		
		
		String[] locations= {"Pune","Bangalore","Noida","Mumbai"};
		
		for (int i = 0; i < locations.length; i++) {
			
			System.out.println(locations[i].toLowerCase() +" "+locations[i].length());
			
		}
	}

}
