package com.syntaxreviewclass3;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month=2;
		
		
		if(month==1) {
			System.out.println("Jan");
		}else if(month==2) {
			System.out.println("Feb");
		}else if(month==3) {
			System.out.println("Mar");
		}else if(month==4) {
			System.out.println("Apr");
		}else if(month==5 ) {
		System.out.println("May");
		}

		
		switch(month)  {
		
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
		}
		
	}

}
