package com.syntaxClass10;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets create an 2D array of groceries
		
		String [][] groceries= {
				{"banana","apples","mango"},//0
				{"potato","tomato"},//1
				{"milk","cheese","ayran","yogurt"}//2
		};
				
		System.out.println(groceries.length);// # of arrays
		
		System.out.println(groceries[2][3]);//yogurt
		
		// I want to find how many elements my 1 array has
		
				System.out.println("# of elements inside 1 array="+groceries[0].length);
				System.out.println("# of elements inside 2 array="+groceries[1].length);
				System.out.println("# of elements inside 3 array="+groceries[2].length);
				
				// how do we get all elements from 2D array??????
				
				for(int i=0; i<groceries.length; i++) { // iterates over arrays/ rows
					for(int j=0; j<groceries[i].length; j++) {// iterates over elements /columns
						System.out.println(groceries[i][j]+" ");
					}
					
					System.out.println();
				}
				
				
				
		

	
	}
}
