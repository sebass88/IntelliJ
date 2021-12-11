package com.syntaxclass07;

public class Class07Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculate sum of all even and all odd numbers
		//from range 1 to 100
		System.out.println("Even Numbers");
		int sum=0;
		
		for(int a=2; a<=100; a+=2) {
			sum+=a;
			
			
		}
		System.out.print(sum+" ");
		
		System.out.println();
		System.out.println("Odd Numbers");
		int sums=0;
		for(int b=1; b<=100; b+=2) {
			sums+=b;
			
		}
		System.out.println(sums+" ");
		
		System.out.println("even + odd = "+(sum+sums));


	}

}
