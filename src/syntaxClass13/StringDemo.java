package com.syntaxClass13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Sharif";
		String name1="Mykl";
		System.out.println(name1.length());
		System.out.println(name.length());
		
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		String str="this is easy 123456 $^%^";
		System.out.println(str.toUpperCase());
		
		//System.out.println(name+name1);// Recommended to USE ALWAYS
		//System.out.println(name.concat(name1));//NOT RECOMMENDED TO USE
		
		int number=10;
		System.out.println(name+name1+number);
		
		

	}
}
