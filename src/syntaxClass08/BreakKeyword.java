package com.syntaxClass08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean summer=true;
		int temp=75;
		
		while(summer) {
			
			System.out.println("i am happy i love summer");
			
			if(temp>=100) {
				System.out.println("i dont love summer anymore");
				break;
			}
			
			temp+=5;
		}

	}

}
