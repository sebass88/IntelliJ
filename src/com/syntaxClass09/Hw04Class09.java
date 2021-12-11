package com.syntaxClass09;

public class Hw04Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array on integers and
		// calculate the sum of all elements in an array
		int sum=0;
		int[] num={100,300,500,900};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+" ");
			
			System.out.println();
			sum+=num[i];
		
			
		}
		System.out.println("the sum of all elements =" +sum);


	}

}
