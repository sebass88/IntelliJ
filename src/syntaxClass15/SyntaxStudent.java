package com.syntaxClass15;

public class SyntaxStudent {
	
	static String school="Syntax";
	static int durationofcourse=6;
	String name;
	String id;
	void calculatefee() {
		int currentmonth=3;
		double tax=10;
		System.out.println(name+" has to pay "+currentmonth*1000+1000*tax);
	}

}
