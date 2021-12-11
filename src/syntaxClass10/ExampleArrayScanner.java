package com.syntaxClass10;

import java.util.Scanner;

public class ExampleArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I want to create an array and store elements using Scanner
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside arrays of cars");
		
		int size=scan.nextInt();	
		
		String[] cars=new String[size];
		// Storing elements inside an array of cars
		for(int i=0; i<cars.length; i++) {
			
			System.out.println("Please enter yours cars");
			
			cars[i]=scan.next();
		}
		
		// retreive all store elements
		
		for(String car:cars) {
			System.out.println(car+" ");
		}

	}

}
