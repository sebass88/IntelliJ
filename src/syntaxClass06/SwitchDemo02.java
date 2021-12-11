package com.syntaxClass06;

import java.util.Scanner;

public class SwitchDemo02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter country");
	String country=scan.next();
	String  food=null;
	
	switch(country) {
	case "Peru":
		food="Lomo Saltado";
		break;
	case"USA":
		food="Burgers and Hot Dogs";
		break;
	case"Italy":
		food="spaghetti";
		break;
		default:
			food="wrong country";
			
}System.out.println("If your country is "+country+ " your favorite food is "+ food);
	
	
	

	}

}
