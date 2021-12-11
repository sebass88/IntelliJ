package com.syntaxClass14;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jkjrj092r959590353j554242#$%";
		System.out.println(str.replaceAll("[0-5]", "*"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));
		System.out.println(str.replaceAll("[$%aZ]", "*"));
		System.out.println(str.replaceAll("[0-9]", " "));
		
	}

}
