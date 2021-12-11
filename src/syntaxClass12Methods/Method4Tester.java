package com.syntaxClass12Methods;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods4 canbeanyname=new Methods4();
		//value from method 1 will be stored in name variable
		String name=canbeanyname.method1();
		System.out.println(name);
		System.out.println(canbeanyname.method2("roman"));
		canbeanyname.method3();
		canbeanyname.method4("nasir");
		System.out.println(canbeanyname.method5(name));
		
		
	}

}
