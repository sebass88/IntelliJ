package com.syntaxClassReview4;

class Animal{
    public void eat(){
        System.out.println("All Animals eat");
    }
}

public class Dog extends Animal {
    public void bark(){
        System.out.println("Dog barks ");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}
class Puppy extends Dog{
    @Override
    public void bark() {
        System.out.println("puppy barks");
    }
    public void drinkMilk(){
        System.out.println("Puppy drinks milk");
    }

    @Override
    public void eat() {
        System.out.println("Puppy eats");
    }
}