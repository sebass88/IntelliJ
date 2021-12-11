package com.syntaxClass14;

public class StringDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Batch 11 Batch is good ";
		System.out.println(str.replace("good", "great"));
		
		 str="This is Batch 11 is good Batch 11 is good ";
		System.out.println(str.replace("good", "Great").replace("Batch", "Not Batch"));
		System.out.println(str.replaceFirst("good", "Great"));
		
		

	}

}
