package com.syntaxClass5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("do you have a credit card?");
		
		String answer=input.next();
		
		if(answer.equals("yes")||answer.equals("yep")||answer.equals("yeah")) {
			System.out.println("Please tell me the balance");
		}else {
			System.out.println(" do you want to get a credit card?");
		}
        System.out.println("end of the code");
	}

}
