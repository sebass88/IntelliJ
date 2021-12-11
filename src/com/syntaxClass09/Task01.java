package com.syntaxClass09;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 way of creating an array
		char c='a';
		char[]array=new char[6];
		array[0]='A';
		array[1]='B';
		array[2]='C';
		array[3]='D';
		array[4]='E';
		array[5]='F';
		
		System.out.println(array[1]);
		
		// 2nd way of creaing an array
		
		char[] gradesArray= {'A','B','C','D'};
		
		System.out.println(gradesArray.length);// 4
		System.out.println(gradesArray[2]);// element with inderz 2 is C
		
		
		String[] names= {"Alex","mehmet","Naiya","Yogita"};
		names[0]="Prisyari";
		System.out.println(names[0]); // after changing the name 
		
		names[4]="John";
		System.out.println(names[4]);// DOES NOT WORK ERROR ARRAY INDEX OUT OF BOUNDS EXCEPTION
		
		
		
		String[] cars= {};
		System.out.println(cars.length);
		
		String[] carrs=new String[3];
		
		// CANNOT DECLARE AN ARRAY SEPARATELY IF WE WANT TO STORE VALUES IN SHORTER WAY
		//int[] nums;
		//num= {10,12,11};
		
		

	}

}
