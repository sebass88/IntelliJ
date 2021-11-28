package Class23;

import java.util.concurrent.Callable;

public class Parent {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT_OF_AVE_HUMAN=30.0;
    final double HEIGHT=5.4;
    static final int NO_OF_LEGS=2;
    String hairColor;
    private void printName(){
        System.out.println(NAME);
    }
    void printHairColor(){
        System.out.println(hairColor);
    }
    final void printAge(){
        System.out.println(AGE);
    }

    protected final void printHeight(){
        System.out.println(HEIGHT);
    }

    public final void printWeight(){
        System.out.println(WEIGHT_OF_AVE_HUMAN);
    }

    public static void printNoOfLegs(){
        System.out.println(NO_OF_LEGS);
    }

    // Static final Parent(){
    // NOT ALLOWED
}class Child extends Parent{
    public static void printNoOfLegs() {
        System.out.println("From child"+ NO_OF_LEGS);


    }
    void printHairColor(){
        System.out.println("Black from Child");
    }
}

