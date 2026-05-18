package com.cg.OOPS.Inheritance;

public class Animal {
	
	void eat() {
		System.out.println("I am EATING!!");
	}

}

class Dog extends Animal{
	
	void bark() {
		System.out.println("dOG bARKS!!");
	}
	
	void eat() {
		System.out.println("Dog is eating!!");
	}
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.eat();
		dog.bark();
	}
}
