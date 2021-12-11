package com.syntaxClass16;

public class Dog {
	
	String name;
	static int noOflegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	
	void displayName() {
		System.out.println(name);
	}
	void printInfo() {
		displayName();
		displayColor();
	}
	
	
	static void DisplayLegs() {
		System.out.println(noOflegs);
	}

}
