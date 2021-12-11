package com.syntaxClass5;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output “It is a weekday”
		//, any day from 6-7 → output “It is a weekend”, 
		//any other day → output “Invalid day”
		
		Scanner scan =new Scanner(System.in);
		System.out.println("which day is it today?");
		
		int day=scan.nextInt();
		
		if(day==1||day==2||day==3||day==4||day==5) {
			System.out.println("its a weekday");
			

		
		
		}else if(day==6||day==7) {
			System.out.println("its a weekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
