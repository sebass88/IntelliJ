package com.syntaxClassReview4;

public class DogTester {
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.sleep();
        puppy.bark();
        puppy.drinkMilk();

        System.out.println("-------------------");
        Dog dog=new Puppy();
        //Run Time PolyMorphism
        dog.bark();
        dog.sleep();

        System.out.println("----------");
        // Compiler gives access to the methods based on the Referenced
        Animal animal=new Puppy();
        animal.eat();
    }
}
