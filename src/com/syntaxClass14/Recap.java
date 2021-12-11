package com.syntaxClass14;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Nasiri";
		System.out.println(name.length());
		System.out.println(name.startsWith("N"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("R"));
		System.out.println(name.contains("s"));
		System.out.println(name.equals("NAsir"));
		System.out.println(name.equalsIgnoreCase("NAsir"));
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("i"));
		System.out.println(name.substring(3));
		System.out.println("--------------------");
		System.out.println(name.substring(3,4));
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		
		String sentence="this is a Java class";
		System.out.println(sentence.split(" ").length);
		System.out.println(Arrays.toString(sentence.split(" ")));
		System.out.println(sentence.split(" ")[3]);
		

	}

}
