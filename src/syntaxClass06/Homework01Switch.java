package com.syntaxClass06;

import java.util.Scanner;

public class Homework01Switch {

	public static void main(String[] args) {
		// HW:  Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/).
	   // Based on operator provide the result to user.
		
		Scanner in=new Scanner(System.in);
		System.out.println("please enter number");
		int num1=in.nextInt();
		System.out.println("please enter number");
		int num2=in.nextInt();
		System.out.println("enter operator sign");
		String ops=in.next();
		
		switch(ops) {
		case"+":
		System.out.println("the answer is "+(num1+num2));
			break;
		case"-":
			System.out.println("the answer is "+(num1-num2));
			break;
		case"*":
			System.out.println("the answer is "+(num1*num2));
			break;
		case"/":
			System.out.println("the answer is " + (num1/num2));
			break;
			default:
				System.out.println("wrong input");
		}

	}

}
