package com.syntaxClass5;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("person height in inches");
		
		int inches=scan.nextInt();
		if(inches>=1 && inches<=60) {
			System.out.println("you are short height");
		}else if(inches>=61 && inches<=72) {
			System.out.println("you are medium height");
		}else if(inches>=72) {
			System.out.println("you are tall height");
		}else {
			System.out.println("invalid inches");
		}



	}

}
