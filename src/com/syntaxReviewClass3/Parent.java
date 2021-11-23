package com.syntaxReviewClass3;

public class Parent {
    public Parent(String str){

        System.out.println("I am a parent class contructor");
    }
}




class Child extends Parent{



    public Child(String str){
        super(str);
        System.out.println("I am a Child class contructor");
    }

}
