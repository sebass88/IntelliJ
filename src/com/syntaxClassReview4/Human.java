package com.syntaxClassReview4;

public abstract class Human { // every abstract class Must participate in the Inheritance

    String name,lastname;
    static boolean brain;

    public Human(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    public void printInfo(){
        System.out.println(name+" "+lastname);
    }

    static void sleep(){
        System.out.println("All humans sleep");
    }

    static void eat(){

        System.out.println("All humans eat");
    }
    private void live(){
        System.out.println("This method is useless");
    }

    public abstract void speak();
}
