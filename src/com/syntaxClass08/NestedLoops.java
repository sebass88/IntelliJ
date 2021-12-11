package com.syntaxClass08;

public class NestedLoops {

	public static void main(String[] args) {
		// Outer Loop always controls Inner Loop
		
		for(int i=0; i<=9; i++) {//outer Loop
			
			
			
			for(int j=0; j<=9; j++) {// Inner Loop
				
			
				
				for(int k=0; k<=9; k++) {
					for(int m=0; m<9; m++) {
						
						System.out.println(i+" "+j+" "+k+" "+m);
					}
				}
			}
		}
		
		
		System.out.println("----------multiplacation table---------");
		
		for(int i=1; i<=10; i++) {
			
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
