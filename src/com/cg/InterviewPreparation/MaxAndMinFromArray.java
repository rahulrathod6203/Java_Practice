package com.cg.InterviewPreparation;

public class MaxAndMinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,43,76,32,94,39,77,99};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(max+" "+min);

	}

}
