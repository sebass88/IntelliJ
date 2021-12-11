package com.syntaxClass09;

public class HwfromClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CLOCK
		String time;
		for( int h=0; h<=23; h++) {
			for(int m=0; m<=59; m++) {
				
				if(h<10 &&m<10) {
					
					time="0"+h+":0"+m;
				}else if(h>=10 &&m<10) {
					time=h+":0"+m;
				}else if(h<10 &&m>=10) {
					time="0"+h+":"+m;
				}else {
					time=h+":"+m;
				}
				
				System.out.println(time);
			}
		}
		
		

		

	}

}
