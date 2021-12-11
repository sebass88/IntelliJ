package com.syntaxClass5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean zoo=!false;
		System.out.println(zoo);
		
		boolean israin=false;
		
		if(!israin) {
			System.out.println("i will go for a walk");
			
			
			String username="test";
			String password="password";
			
			if(!username.equals(password)) {
				System.out.println("i am accepting your password");
			}
		}

	}

}
