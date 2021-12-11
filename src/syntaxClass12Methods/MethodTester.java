package com.syntaxClass12Methods;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Line before method call");
		Methods methods=new Methods();
		methods.times=3;
		//methods.sayHello();
		methods.sayHelloManyTimes();
		//methods.sayHelloManyTimeswithState();
		//methods.sayHelloManyTimeswithParameter(10);
		System.out.println("Line after ");

	}

}
