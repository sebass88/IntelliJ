package com.syntaxClass09;

public class Hw01class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		String[] cars= {"honda","ford","cadillac","ferrari","chevy","nissan"};
		for(String c:cars) {
			System.out.println(c);
		}
		
		System.out.println("====================================");
		
		String[] makes= {"honda","ford","cadillac","ferrari","chevy","nissan"};
		for(int i=0; i<makes.length; i++) {
			System.out.println(makes[i]);
		}



}
}