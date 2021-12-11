package com.syntaxreviewclass3;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month="Jan";
		int day=2;
		
		if(month.equals("Jan")) {
			if(day==1) {
				System.out.println("this is the first week of jan");
			}
		}else {
			System.out.println("this is not Jan");
		}
				
		System.out.println("code after nested if condition");

	}

}
