package com.syntaxClass14;

public class Task1Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a string that will hold a sentence write a program
		//to get a new string without any spaces.
		String sentence="I hate staying up";
		System.out.println(sentence.replace(" ",""));
		
		
		// Create a string that should be a combination of letters, number and 
		//special characters find out how many alpha characters are there in the string.
		
		String str="kslkflskfGHJGHJGHJH345345679";
		System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
		
		
		//You have a string a="Is it saturday. Is it rainig? Do we have a Java Class today?"
		//how would you find out how many sentences are in that string?
		
		String str2="Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(str2.split("[?.!]").length);
		
		// How would you reverse a string word by word?
		
		String str3="This is sentence i want to reverse";
		String[]str3arr=str3.split(" ");
		
		for(String word:str3arr) {
			StringBuilder stringbuilder=new StringBuilder(word);
			System.out.print(stringbuilder.reverse()+" ");
		}
		System.out.println("==================================");
		
		
		// How would you check if String is palidrome or not?
		
		String str4="racecar";
		StringBuilder stringbuilder=new StringBuilder(str4);
		stringbuilder.reverse();
		if(str4.equals(stringbuilder)) {
			System.out.println(str4+" is palidrome");
		}else {
			System.out.println(str4+ " not a palidrome");
		}
		
		// How would you swap 2 strings without temporary variable?
		
		String str5="Hormat";
		String str6="Sorbon";
		str5=str5+str6;
		str6=str5.replace(str6, "");
		str5=str5.replace(str6, "");
		System.out.println(str5);
		System.out.println(str6);
	
		
		

	}

}
