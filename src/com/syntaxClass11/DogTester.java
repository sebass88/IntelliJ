package com.syntaxClass11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog zemasDog= new Dog();
		zemasDog.name="tom";
		zemasDog.breed="hound";
		zemasDog.colors="brown";
		zemasDog.height=3.0;
		zemasDog.age=10;
		zemasDog.gender='M';
		
		System.out.println("my dog name is "+zemasDog.name);
		System.out.println("his breed is "+zemasDog.breed);
		System.out.println("his gender is "+zemasDog.gender);
		
		Dog jimmyDog=new Dog();
		jimmyDog.name="teddy";
		jimmyDog.breed="labrador retreiver";
		jimmyDog.colors="golden";
		
		System.out.println("my dog name is "+jimmyDog.name);
		System.out.println("his breed is "+jimmyDog.breed);
		System.out.println("his color is "+ jimmyDog.colors);
		
		Dog arwasDog=new Dog();
		arwasDog.name="Manroe";
		System.out.println("my dog name is "+arwasDog.name);

	}

}
