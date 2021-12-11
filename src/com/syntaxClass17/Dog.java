package com.syntaxClass17;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	
	public Dog(String dogname,String dogcolor,String dogbreed,int dogage,double dogweight) {
		System.out.println("Dogs contructor is called");
		name=dogname;
		color=dogcolor;
		breed=dogbreed;
		age=dogage;
		weight=dogweight;
	}
	
	
	public void printName() {
		System.out.println(name);
	}
	public void printColor() {
		System.out.println(color);
	}
	public void printAge() {
		System.out.println(age);
	}

}
