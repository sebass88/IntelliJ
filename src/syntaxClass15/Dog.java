package com.syntaxClass15;

public class Dog {

	String name;     // Instance variable
	String color; // Istance variable
	static int numoflegs=4;
	
	void sleep() {
		int times=3;
		System.out.println(times);
		System.out.println(name+" is sleeping");
	}
	void eat() {
		//System.out.println(times); as times is local variable we can not access it outside of sleep method
		System.out.println(name+" can eat");
	}

}
