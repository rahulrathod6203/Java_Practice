package com.cg.old.Thread;

public class Thread1 extends Thread {

	public void run() {
		System.out.println("run method.");
		currentThread().setName("rOSHAN");
		System.out.println(currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t = new Thread1();
		System.out.println(currentThread().getName());
		
		t.setName("Rahul");
		t.start();

	}

}
