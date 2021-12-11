package com.syntaxClass5;

import java.util.Scanner;

public class Homework02Class5 {

	public static void main(String[] args) {
		 // Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
        //if the average score >=90 → grade=A
       //if the average score >= 70 and <90 → grade=B
      //if the average score>=50 and <70 → grade=C
     //if the average score<50 → grade=F
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your quiz grades");
		int quiz=input.nextInt();
		System.out.println("Please enter your mid term grades ");
		int midterm=input.nextInt();
		System.out.println("Please enter your final grades");
		int finalscores=input.nextInt();
		
		int average=(quiz+midterm+finalscores)/3;
		
		if(average>=90) {
		System.out.println("Grade A");
		}else if(average<=90) {
			System.out.println("Grade B");
		}else if(quiz+midterm+finalscores>=50 && quiz+midterm+finalscores<=70) {
			System.out.println("Grade C");
		}else if(quiz+midterm+finalscores<=50) {
			System.out.println("Grade F");
		}
		
		
		
		


	}

}
