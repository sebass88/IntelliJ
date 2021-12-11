package com.syntaxClass13;

public class TaskHw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ABCD";
		StringBuffer sb=new StringBuffer(name);
		
		System.out.println(sb.reverse());
		
		String na="Sunday";
		String newStr="";
		for(int i=na.length()-1;i>=0;i--) {
			newStr+=na.charAt(i);
		}
		System.out.println(newStr);
		
		

	}

}
