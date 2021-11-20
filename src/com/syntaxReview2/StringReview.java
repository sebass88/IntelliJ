package com.syntaxReview2;

public class StringReview {
    public static void main(String[] args) {



        String str=" Today is thursday and it is Java review";

        boolean empty=str.isEmpty();
        System.out.println("My string is empty"+empty);


        int length=str.length();
        System.out.println("Length of the string is"+length);

        // Instead of thursday  i want to have monday

        str=str.replace("thursday","Monday");
        System.out.println(str);

        // how many words my string has?

        String[] allWords=str.split(" ");
        System.out.println("In my string I have "+allWords.length+" words");

        // print all words 1 by 1
        for(String word:allWords){
            System.out.print(word+" ");


        }

        // how would i reverse a String?

        String give="Hello";

        StringBuilder sb=new StringBuilder(give);
        sb.reverse();

        System.out.println(sb);

        // How would you reverse a String without using reverse StringBuilder
        String reverse="";
        for(int i=give.length()-1;i>=0;i--){
            reverse+=give.charAt(i);
        }
        System.out.println(reverse);

        // Substring
        String s="Today I am happy";

        s=s.substring(6);
        System.out.println(s);// I am happy

        s=s.substring(0,4);
        System.out.println(s); // I am

        String c="Hello i love java";
        boolean var;
        var=c.startsWith("hello");
        System.out.println(var);









    }


}
