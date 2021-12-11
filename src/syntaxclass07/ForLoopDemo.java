package com.syntaxclass07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * initialization
		 * condition
		 * increment/decrement
		 */
		for(int a=1; a<=5; a++) {
			System.out.println("hello");
		}

		/*
		 * 1.start point
		 * 2.end point
		 * 3.increment/decrement
		 */
		for(int b=1;  b<=20; b++) {
			System.out.print(b+" ");
		}
		
		System.out.println("");
		for(int c=100; c>=20; c--) {
			System.out.print(c+" ");
		}
		
		
		for(int d=1; d<=50; d++) {
			if(d%2==0) {
				
			}
			System.out.print(d+" ");
		}
		
		System.out.println();
		System.out.println("print even number from 1 to 50------------");
		
		
		for(int f=2; f<=50; f+=2) {
			System.out.print(f+" ");
		}
		
		System.out.println();
		
		for(int g=1; g<=20; g+=5) {
			System.out.print(g+" ");
		}
	}
	
	
	
	

}
