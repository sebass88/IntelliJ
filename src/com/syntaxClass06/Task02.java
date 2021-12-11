package com.syntaxClass06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		//Allow user to enter grade (A, B, or C etc...)
		// and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade -->//Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
		// 

		Scanner grades=new Scanner(System.in);
		System.out.println("please enter your grade");
		String g=grades.next();
		String explanation;
		
		switch(g) {
		case"A":
			explanation="Excellent";
			break;
		case"B":
			explanation="Good";
			break;
		case"C":
			explanation="Average";
			break;
		case"D":
			explanation="Bad";
			break;
			default:
				explanation="Not Acceptable";
		}
System.out.println("grade you enter "+g+" means " + explanation);
	}

}
