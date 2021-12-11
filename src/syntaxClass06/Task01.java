package com.syntaxClass06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
	
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your country");
		String c=in.next();
		String lang=null;
		
		switch(c) {
		case "Peru":
			lang="spanish";
			break;
		case"USA":
			lang="english";
			break;
		case"Italy":
			lang="Italian";
			break;
			default:
				lang="unknown";
		
		}
		System.out.println("user speaks "+lang);

	}

}
