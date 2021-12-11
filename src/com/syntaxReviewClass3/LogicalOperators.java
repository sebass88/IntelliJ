package com.syntaxReviewClass3;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day= "sat";
		
		if(day.equals("sat"))  {
			System.out.println("its weekend");
		}else if(day.equals("sun")) {
			System.out.println("its weekend");
		}else {
			System.out.println("its week day");
		}
		

		if(day.equals("sun")|| day.equals("sat")) {
			System.out.println("its weekend");
		}else {
			System.out.println("its week day");
		}

	}

}
