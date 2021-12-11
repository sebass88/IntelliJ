package com.syntaxClass09;

public class AllFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GETTING ALL THE ARRAYS TO PRINT OUT
		int[] num= {100,200,300,400,500};
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]+" ");
			
		}System.out.println("--------------------------");
		
		
		// TO ACCESS ALL ELEMENTS FROM AN ARRAY WE CAN USE 
		// FOR EACH LOOP/ADVANCED FOR LOOP/ENHANCED
		// NEVER SKIPS ELEMENTS
		
		for(int n:num) {
			System.out.println(n);
		}System.out.println("--------------------------------------");
		
		
		String[] colors= {"red","blue","white"};
		for(String col:colors) {
			System.out.println(col);
		}

	}

}
