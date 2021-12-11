package com.syntaxClass10;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LONGER WAY OF DOING 2D ARRAYS!!!!!!!!!!
	     int[][] bigArray=new int[3][3];
	     // adding element inside 1 array or 1 row
	     bigArray[0][0]=10;
	     bigArray[0][0]=20;
	     bigArray[0][0]=30;
	     
	     // Adding element inside 2 array or 2 row
	     
	     bigArray[1][0]=1;
	     bigArray[1][1]=2;
	     bigArray[1][2]=3;
	     
	     //adding element inside 3 array or 3 row
	     bigArray[2][0]=100;
	     bigArray[2][1]=200;
	     bigArray[2][2]=300;
	     
	     // how to access?
	     System.out.println(bigArray[2][1]);// answer 200
	     
	     // what it shows?
	     System.out.println("2D array size "+bigArray.length);
	     // returns # of id

	}

}
