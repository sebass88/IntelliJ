package com.syntaxClass13;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username="sebas_1213";
		String password="abcd1234";
		String cpassword="abcd1234";
		
		if(username.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is toot short");
		}else if(password.contains(username)) {
			System.out.println("password cannot contain username");
		}else if(password.equals(cpassword)) {
			System.out.println("Your username and password has been created");
		}else {
			
			System.out.println("Password do not match");
		}
		
		
		

	}

}
