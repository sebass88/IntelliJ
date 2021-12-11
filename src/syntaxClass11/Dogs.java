package com.syntaxClass11;

public class Dogs {
	
	String breed;
	String colors;
	int age;
	char gender;
	double height;
	String name;
	
	void barks() {
		System.out.println("Likes to bark alot");
	}
	void walks() {
		System.out.println("Likes to get walked alot");
	}
	
	void manners() {
		System.out.println("is a  well trained dog");
	}
	public static void main(String[] args) {
		
		
		Dogs johndog=new Dogs();
		johndog.breed="Husky";
		johndog.name="Wolfy";
		johndog.gender='m';
		
		Dogs amydog=new Dogs();
		amydog.breed="Labrador";
		amydog.colors="golden";
		amydog.name="Goldy";
		
		Dogs lukedog=new Dogs();
		lukedog.breed="Bulldog";
		lukedog.gender='F';
		lukedog.age=10;
		
		System.out.println("John's dogs name is "+johndog.name+" he is a "+johndog.breed+" and he's a "+johndog.gender);
		johndog.walks();
		System.out.println("-------------------------------");
		System.out.println("Amy's dog name is "+amydog.name+" she is a "+amydog.colors+" "+amydog.breed);
		amydog.barks();
		System.out.println("----------------------------------");
		System.out.println("Luke has a "+lukedog.breed+ " that is turning "+lukedog.age+" today");
		lukedog.manners();
		
	}
	
	
	
	

}
