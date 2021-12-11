package com.syntaxClass06;

public class WhileHomework {

	public static void main(String[] args) {
    // Print numbers from 1 to 100 in 1 line with space
    //Print numbers from 100 to 1
    //Print even numbers from 20 to 100 
    //Print only odd numbers from 100 to 1
		
		int n=1;
		while (n<=100) {
			System.out.print(n+" ");
			n++;
		}
		System.out.println();

		int x=100;
		while(x>=1) {
			System.out.print(x+" ");
			x--;
	} 
       System.out.println();
       
       System.out.println("printing even numbers from 20 to 100");
       int y=20;
       while(y<=100) {
    	   System.out.print(y+" ");
    	   y+=2;
       }
        System.out.println();
        System.out.println("printing odd numbers from 100 to 1");
        int z=100;
        while(z>=1) {
        	if(z%2==1) {
        		System.out.print(z+" ");
        		
        	}
        	z--;
        }
	}
}
