package com.syntaxClass17;

public class Book {
	//Write Book class that will have instance variables and 2 Constructors. 
	//While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	
	private String name;
	private int price;
	private int pages;
	
	public Book() {
		
	}
	public Book(String name) {
		
		this.name = name;
	}

	public Book(String name, int price, int pages) {
	
		this(name);
		this.price = price;
		this.pages = pages;
	}
	

	public void printbookinfo() {
		System.out.println("The name of the book is "+name+ " it cost "+price+" dollars and has "+pages+" pages");
	}
	
	
	
	
	

}
