package com.syntaxClass09;

public class Hw02Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an array of animals and store 6 elements 
		//into it. Using 2 different loops 
		//print all elements from the array.
		System.out.println("for loop");
		
		String[] animals= {"lion","tiger","monkey","eagle","whale","snake"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("=============================================");
		
		System.out.println("advanced loop");
		String []an= {"lion","tiger","monkey","eagle","whale","snake"};
		for(String a:an) {
			System.out.println(a);
		}


	}

}
