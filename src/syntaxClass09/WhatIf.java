package com.syntaxClass09;

public class WhatIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<3; i++) {
			
			for(int j=0; j<=2; j++) {
				
				System.out.println("Hello");
				break; // Breaks only the Inner Loop
			}
			
			System.out.println("Good morning");
			
		}
		
		System.out.println("==============================================");
		boolean morning=true;
		for(int i=1; i<=3; i++) {
			
			System.out.println("I am for loop");
			
			while(morning) {
				System.out.println("good morning");
				break;
			}
			
			
			
		}
		
		System.out.println("----------------------------------------------");
		
		
		for (int i=1; i<3; i++) {
			
			for(int j=1; j<=2; j++) {
				
				if(j==1) {
					continue;
					
				}
				System.out.println("hello");
			}
			System.out.println("good morning");
		}

	}

}
