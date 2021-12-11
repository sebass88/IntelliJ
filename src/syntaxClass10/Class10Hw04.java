package com.syntaxClass10;

public class Class10Hw04 {

	public static void main(String[] args) {
		///*Using 2D array create a grocery list.
		//Inside you should have an array
 		//of veggies, fruits, dairy and sweets. 
		//Retrieve all values from that array using 2 different loops
		 
		
		String [] [] groceries= {
				{"grapes","apples","mango"},
				{"carrots","spinach","tomato"},
				{"milk","yogurt"},
				{"cookies","cakes"}
				
				
		};for(String[]gro:groceries) {
			for(String g:gro) {
				System.out.println(g);
			}
			
		}
		System.out.println("---------------------");
		
		for(int a=0;a<groceries.length;a++) {
			for(int b=0; b<groceries[a].length;b++) {
				System.out.println(groceries[a][b]+" ");
			}
		}

	}

}
