package com.syntaxClass12Methods;

public class Methods {
	int times=5;
	void sayHello() {
		System.out.println("Hello Batch 11");
	}
	
	void sayHelloManyTimes() {
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
	}
	
	void sayHelloManyTimeswithState() {
		for(int i=0; i<times;i++) {
			System.out.println("hello batch 11");
		}
	}
	
	void sayHelloManyTimeswithParameter(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}



	}


