package com.syntaxClass10;

public class AllElementsFromArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] number= {
				
				{100,200,300},
				{9,8,7},
					
				};
		
		System.out.println("size of 2D array"+number.length);
		
		System.out.println(number[1][1]);// 8
		// get all elements
		// get all elements using enhanced for loop
		for(int[]nums:number) {
			for(int n:nums) {
				System.out.println(n+" ");
			}
		}
		System.out.println();
		
		System.out.println("get all elements using regular for loop");
		
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				int element=number[i][j];
				System.out.print(element +" ");
			}
		}
		}
 
	}


