package com.syntaxClass16;

public class Task2 {
	//Create a method that will take a String as a parameter and returns reversed String. 
	//Method should be available to all classes within your project and 
	//accessible by class name.
	
	public static String reversestr(String str) {
		
		//StringBuilder strbuilder=new StringBuiler(str);
		//strbuilder.reverse();
		//String newStr=strbuilder.toString();
		//return newStr;
		return new StringBuilder(str).reverse().toString();
	}
	

}
