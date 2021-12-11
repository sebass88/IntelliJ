package com.syntaxClass10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades= {'A','B','C','D'};
		
		for(char g:grades) {
			System.out.print(g);
		}
		System.out.println();
		
		// Reverse Order
		for(int i=grades.length-1; i>=0; i--) {
			System.out.print(grades[i]);
		}

	}

}
