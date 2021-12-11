package com.syntaxclass07;

public class Class7Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		for(int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		
		for(int c=20; c>=1; c-=2) {
			System.out.print(c+" ");
			
		}
		System.out.println();
		for(int d=20; d>=1; d--) {
			if(d%2==0) {
				System.out.print(d+" ");
			}
		}
		System.out.println();
		for(int e=21; e<=50; e+=2) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int f=20; f<=50; f++) {
			if(f%2==1) {
				System.out.print(f+" ");
			}
			
		}

	}

}
