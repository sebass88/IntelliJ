package com.syntaxClass17;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog=new Dog("boby","black","bulldog",10,12.5);
		//dog.name="Boby" not allowed as its private
		dog.printName();
		dog.printColor();
		dog.printAge();
		
		

	}

}
