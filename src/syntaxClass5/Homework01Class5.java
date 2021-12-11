
package com.syntaxClass5;

import java.util.Scanner;

public class Homework01Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Write a program for user to enter his/hers birth month. 
	//Based on the month define the season.
	//Example: if user is born in June, July or August → season =“Summer”.
   //At the end of the program we should see output as “You were born is season ______“.
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println(" Please enter your birth month");
		 
		 String month=scan.next();
		 if(month.equals("june")||month.equals("july")||month.equals("august")) {
			 System.out.println("you were born in season summer");
		 }else if(month.equals("september")||month.equals("october")||month.equals("november")) {
			 System.out.println("you were born in season fall");
		 }else if(month.equals("december")||month.equals("january")||month.equals("february")) {
			 System.out.println("you were born in season winter");
		 }else if(month.equals("march")||month.equals("april")||month.equals("may")) {
			 System.out.println("you were born in season spring");
		 }else {
			 System.out.println("invalid month");
		 }
		 		



	}

}
