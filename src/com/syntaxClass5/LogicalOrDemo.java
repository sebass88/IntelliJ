package com.syntaxClass5;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ask user to enter today's day
		 * if monday or friday-->no class
		 * if tuesday or wednesday--> manual class
		 * if saturday or sunday--> Java class
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		
		if(day.equals("monday")||day.equals("friday")) {
			System.out.println("we have no class");
		}else if(day.equals("tuesday")||day.equals("wednesday")) {
			System.out.println("We have manual class");
		}else if(day.equals("saturday")||day.equals("sunday")) {
			System.out.println("we have java class");
		}else {
			System.out.println(" invalid date");
		}
		
				
		
		

	}

}
