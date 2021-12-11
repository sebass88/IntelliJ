package com.syntaxReviewClass3;

public class CommonIssues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f=5.3;
		double g=5.333333333;
		if(f==5.3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(f);
		System.out.println(g);
		
		// Best practice for decimal number always use double
		//for non decimal numbers use integers

	}

}
