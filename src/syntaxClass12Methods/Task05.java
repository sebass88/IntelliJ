package com.syntaxClass12Methods;

public class Task05 {
	
	// Write a method to return whether a
	// given number is prime or not?
	
	
	boolean isprime(int number) {
		boolean isprime=true;
		if(number >1) {
			for(int i=2; i<number;i++) {
				if(number%i==0) {
					isprime=false;
					break;
				}
			}
		}else {
			isprime=false;
		}
		
		return isprime;
	}

}
