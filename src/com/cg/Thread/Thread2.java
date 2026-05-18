package com.cg.Thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Creating thread by Implementing Runnable Interface");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 t=new Thread2();
		
		Thread th=new Thread(t);
		
		th.start();
		
		

	}

}
