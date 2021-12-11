package com.syntaxClass09;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array
		//: “Saturday is Java coding Day”.
		
		String[] names= {"Java","Saturday","day","coding"};
		
		System.out.println(names[0]+" is "+names[1]+" "+names[3]+" "+names[2]);
		
		System.out.println("--------------------------------------------");
		
		
		//other ways of doing it 
		// USING FOR LOOPS!
		
		
		String[] words= {"java","saturday","day","coding","is","love","happy"};
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i]);
			
		}

	}

}
