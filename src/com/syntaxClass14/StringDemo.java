package com.syntaxClass14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is Tuesday. Today we have java class";
		String[] strArr=str.split("[.]");
		
		for(String s:strArr) {         //No Commas
			System.out.println(s);
		}

	}

}
