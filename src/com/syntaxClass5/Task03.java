package com.syntaxClass5;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		if(num1==num2 && num1==num3) {
			
		}
		
		
		if(num1>=num2&& num1>=num3) {
			
			System.out.println("is the largest number");
		}else if(num2>=num3&& num2>=1) {
			System.out.println("is the largest number");
		}else if(num3>=num2&& num3>=num1) {
			System.out.println("is the largest number");
		}

	}

}
