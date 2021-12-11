package com.syntaxClass08;

public class ContinuedKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			
			if(i==3||i==4||i==2) {
				continue;
			}
			System.out.print("$"+" ");
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			
			if(i==7|| i==3||i==9){
				continue;
				
			}
			System.out.print(i+" ");
		}
		
		
		System.out.println("end of the code");

	}

}
