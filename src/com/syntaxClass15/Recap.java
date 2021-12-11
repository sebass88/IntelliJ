package com.syntaxClass15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Lubo. Lubo is break manager.";
		System.out.println(str.replace("Lubo", "Sorbon"));
		System.out.println(str.replaceAll("Lubo", "Sorbon"));
		
		String str2="fskjfsjfsfaHJHKJ42409%^&%^%$%%";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));
		
		String str3="Hello";
		for(int i=0; i<5;i++) {
			str3=str3+i;
		}
		System.out.println(str3);
		
		
		String str4="Me: Look it's not you it's me, I just have some thing i need to work out\r\n";
				
		
		StringBuilder strBuilder=new StringBuilder(str4);
		strBuilder.reverse();
		System.out.println(strBuilder);

	}

}
