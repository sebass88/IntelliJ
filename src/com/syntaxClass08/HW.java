package com.syntaxClass08;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String item;
		double price;
		double money;
		double reminder;
		double sum=0;
		
		System.out.println("Please enter the item you want to purchase");
		item=scan.next();
		
		System.out.println("Please enter the price");
		price=scan.nextDouble();
		
		do {
			
			System.out.println("Please pay for the "+item);
			money=scan.nextDouble();
			
			sum+=money;
			
			if(sum>price) {
				double change=sum-price;
				System.out.println("here is your change" + change);
				break;
			}else if(sum<price)  {
				reminder=price-sum;
				System.out.println("Please give me more" + reminder);
			}else {
				System.out.println("you got the right amount");
			}
			
			
		
		
		

	}while(sum!=price);
		
		System.out.println("thank you for shopping");

}
}	
