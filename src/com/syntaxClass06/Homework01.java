package com.syntaxClass06;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// HW:  Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int a=scan.nextInt();
		System.out.println("Please enter second number");
		int b=scan.nextInt();
		System.out.println("enter operator sign");
		String c=scan.next();
		
		if(c.equals("+"))  {
			System.out.println("the answer is "+(a+b));
		}else if(c.equals("-")) {
			System.out.println("the answer is "+(a-b));
			
		}else if(c.equals("*")) {
			System.out.println("the answer is " +(a*b));
		}else if(c.equals("/")) {
			System.out.println("the answer is "+ (a/b));
		}else {
			System.out.println("the answer is invalid");
		}
		
		
		System.out.println("");
		

	}

}
