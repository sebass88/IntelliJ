package com.syntaxClass11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human tamanna=new Human();
		
		tamanna.name="Tamanna";
		tamanna.age=16;
		tamanna.height=5.8;
		tamanna.gender='F';
		tamanna.bloodtype="A+";
		
		tamanna.eat();
		tamanna.sleep();
		tamanna.walk();
		
		Human sebastian=new Human();
		sebastian.age=18;
		sebastian.gender='M';
		sebastian.race="spanish";
		sebastian.height=6.2;
		sebastian.name="sebastian";
		
		sebastian.eat();
		sebastian.sleep();
		sebastian.sendMemes();
		
		
		
		

	}

}
