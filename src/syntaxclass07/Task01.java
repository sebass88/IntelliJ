package com.syntaxclass07;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i want to ask a user their name and age 5 times
		Scanner scan=new Scanner(System.in);
		
		int i=1;
		while(i<=5) {
			
	
		System.out.println("please enter your name and age");
		
		String n=scan.next();
		int age=scan.nextInt();
		
		System.out.println("Your name is "+n+" and you are "+age+" years old");
		
		i++;
		}
	}

}
