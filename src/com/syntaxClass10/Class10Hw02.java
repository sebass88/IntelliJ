package com.syntaxClass10;

public class Class10Hw02 {

	public static void main(String[] args) {
		// Create a 2D array in which first array will consist of 
		//4 names and second array will contain grades. 
		//Then your program should print name of the students 
		//that has A and B grade
		
		String [] [] students= {
				{"Joe","Alex","Jimmy","sebas"},
				{"A","B","C","D"}
		};
		
		System.out.println(students[0][2]+" has "+students[1][0]+" in class");
		System.out.println(students[0][0]+" has "+students[1][1]+" in class");
		System.out.println(students[0][1]+" has "+students[1][1]+" in class");
		System.out.println(students[0][3]+" has "+students[1][0]+" in class");


	}

}
