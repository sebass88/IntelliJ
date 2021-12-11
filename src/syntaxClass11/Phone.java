package com.syntaxClass11;

public class Phone {
	
	String model;
	String colors;
	int price;
	String batterylife;
	double cost;
	
	void reception() {
		System.out.println("Phone has good service");
	}
	
	void update() {
		System.out.println("have to update every other year");
	}
	
	void connection() {
		System.out.println(" barely any 5g connection");
	}
	public static void main(String[] args) {
		
		Phone Iphone=new Phone();
		Iphone.model="Iphone 13 pro";
		Iphone.batterylife="has a good battery life";
		Iphone.colors="has multiple colors";
		Iphone.price=1000;
		
		
		Phone Android=new Phone();
		Android.model="Samsung Galaxy";
		Android.colors="has many varieties of colors";
		Android.price= 1200;
		
		
		Phone Nokia=new Phone();
		Nokia.model="Nokia G50";
		Nokia.batterylife="battery life not as good ";
		
		
		System.out.println("The "+Iphone.model+" "+Iphone.batterylife);
		System.out.println("The "+Android.model+" "+Android.colors);
		System.out.println("The "+Nokia.model+" "+Nokia.batterylife);
		Nokia.connection();
	}
	
	
	
	

}
