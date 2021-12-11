package com.syntaxClass09;

public class PrintingPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int r=1; r<=4; r++) { //Controls the rows
			
			for(int c=1; c<=5; c++) {// Controls Columns
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		
       for(int r=1; r<=10; r++) { //Outer Loops Controls the rows
			
			for(int c=1; c<=10; c++) {// Inner Loops Controls Columns
				System.out.print(" * ");
			}
			
			System.out.println();
			
			
		}
       System.out.println("---------------------------------");
       
       for(int r=1; r<=13; r--) {
    	   
    	   for(int c=1; c<=7; c++) {
    		   System.out.print(c+" ");
    	   }
    	   System.out.println();
       }
       
       
       
      
       }

}
