package com.syntaxClass11;

public class Car {
	
	String make;// Defining Properties
	String model;
	String color;
	int year;
	double milage;
	void moveFoward() {//Defining Behavior of the 
		System.out.println("Car can move forward");
	}
	public static void main(String[] args) {
		
		Car sebasCar= new Car();
		sebasCar.make="Chevy";
		sebasCar.color="silver";
		sebasCar.model="Cruze";
		
		System.out.println("I have a "+sebasCar.make+" " +sebasCar.model);
		System.out.println("the color of my car is "+sebasCar.color);
		sebasCar.moveFoward();
		
	}

}
