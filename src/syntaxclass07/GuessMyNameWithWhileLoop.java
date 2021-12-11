package com.syntaxclass07;

import java.util.Scanner;

public class GuessMyNameWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int secretnumber=78;
		Scanner in=new Scanner(System.in);
		int usernumber;
		
		System.out.println("please guess my secret number");
		usernumber=in.nextInt();
		
		while(usernumber!=secretnumber) {
			
			System.out.println("please guess my secret number");
			usernumber=in.nextInt();
		}
		System.out.println("you got it");
	}

}
