package com.syntaxClass13;

import java.util.Scanner;

public class TaskHw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name sir ?");
		String sir=scan.next();
		
		System.out.println("What is yor name ma'am?");
		String maan=scan.next();
		
		System.out.println("What are you expecting a boy or girl ?");
		String gender=scan.next();
		
		System.out.println("your suggested baby name is ?");
		if(gender.equals("boy") ){
			System.out.println(sir.substring(0,3)+maan.substring(2,4));
				
			
		
		}else if(gender.equals("girl")) {
			System.out.println(maan.substring(0,2)+sir.substring(3));
		}
			
		
	}

}
