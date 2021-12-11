package com.syntaxReviewClass3;

public class LogicalOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=50;
		
		if(number>0) {
			if(number<100) {
				System.out.println("number is from 1 to 99");
			}else {
				System.out.println("number is out of range");
			}
				
		
		}else {
			System.out.println("number is out of range");
		}
		
		if(number>0&& number<100) {
			System.out.println("number is from 1 to 99");
		

	}else {
		System.out.println("number is out of range");
	}
		
	}

}
