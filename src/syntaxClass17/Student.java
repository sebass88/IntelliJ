package com.syntaxClass17;

public class Student {
	//Write a Student class that have instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.
	
	private String name;
	private String address;
	
	public Student(String sname,String saddress) {
		name=sname;
		address=saddress;
	}
	
	public void displayInfo() {
		System.out.println("Student name is "+name+" and his address is "+address);
	}

}
