package com.syntaxClass5;

import java.util.Scanner;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter current time");
		
		int time=in.nextInt();
		
		if(time>=1 && time<11) {
			System.out.println("right now is morning");
		}else if(time>=12 && time<=15) {
			System.out.println("right now is afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("right now is evening");
		}else if(time>=21 && time<=24) {
			System.out.println(" right now is night");
			
		}else {
			System.out.println(" not a valid time entered");
		}
System.out.println("----------------------------------");

         String timeofday;
         if(time>=1 && time<=11) {
        	 timeofday="morning";
         }else if(time>=12 && time<=15) {
        	timeofday="afternoon";
         }else if(time>=16 && time<=20) {
        	 timeofday="evening";
         }else if(time>=21 && time<=24) {
        	 timeofday="night";
         }else {
        	 timeofday="invalid";
         }
         System.out.println("right now is "+timeofday);
	}

}
