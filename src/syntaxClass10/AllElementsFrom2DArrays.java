package com.syntaxClass10;

public class AllElementsFrom2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2D array is array of arrays
		
		String [][] groceries= {
				{"banana","apples","mango"},//0
				{"potato","tomato"},//1
				{"milk","cheese","ayran","yogurt"}//2
		};
		
		for(String[] grocery:groceries) {
			
			for(String g:grocery) {
				
				System.out.print(g+" ");
			}
			
			System.out.println();
			
		}
				

	}

}
