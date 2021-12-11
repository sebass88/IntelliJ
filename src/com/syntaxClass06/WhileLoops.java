package com.syntaxClass06;

public class WhileLoops {

	public static void main(String[] args) {
	
		
		int time=14;
		
		if(time<17) {
			System.out.println("it is a day");
		}
		while (time<17) {
			System.out.println("is s a day");
			time++;
		}
		
		System.out.println("I want to print numbers from 1 to 20");
		
		int n=1;
		while (n<=20) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("--------------------------");
			
		
		int y=50;
		
		while(y>=1) {
			System.out.println(y+" ");
			y--;
		}
		
		System.out.println(" i want to print even numbers from 1 to 10");
		
		int x=2;
		while(x<=10) {
			System.out.println(x);
			x+=2;
			
			System.out.println(x);
			
			System.out.println("ANOTHER WAY OF DOING IT");
			
			int a=1;
			
			while(a<=10) {
				if(a%2==0) {
					System.out.println(a);
				}
				a++;
			}
		
		}
				
	}
	
	
	
	

}
