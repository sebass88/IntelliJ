package com.syntaxClass10;

public class Class10Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Create 2D array of cars : american, german, korean, italian. 
	//Then retrieve all values from that array using 2 different loops
		String [] [] cars= {
				{"american","german"},
				{"korean","italian"},
				};
		
		for(String[]car:cars) {
			for(String c:car) {
				System.out.println(c+" ");
			}
		}
		
		System.out.println();
		
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.println(cars[i][j]+" ");
			}
		}
		

	}

}
