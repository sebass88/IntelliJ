package com.syntaxclass07;

import java.util.Scanner;

public class DoLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lets create a secret number (1-20)
		 * 
		 * lets ask user to guess my secret number
		 * 
		 * keep asking for a number till user guess the secret number
		 */
		
		int secretnumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		do {
			System.out.println("please guess my secret number.It is a number from 1 to 100");
			 userNumber=scan.nextInt();
		}while(userNumber!=secretnumber);
		
		System.out.println("You got it");
		
		

	}

}
