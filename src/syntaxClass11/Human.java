package com.syntaxClass11;

public class Human {
	String name;
	int age;
	char gender;
	String race;
	double height;
	String bloodtype;
	
	void eat() {
		System.out.println(name+" eats a lot");
	}
	
	void sleep() {
		
		System.out.println(name + " is sleeping");
	}
	
	void walk() {
		
		System.out.println(name+" with bloodtype"+bloodtype+" is walking");
	}
	
	void sendMemes() {
		if(name.equals("sebastian")) {
			System.out.println("sending memes");
		}
		
	}
	
	

}
