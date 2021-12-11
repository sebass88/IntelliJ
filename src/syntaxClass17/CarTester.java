package com.syntaxClass17;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car("Tesla model x","Tesla","Model Y",
		"Black",2018,-1,"123",-1,300,true);
		car.printname();
		
		Car car2=new Car("Tesla model x");
		car2.printname();

	}

}
