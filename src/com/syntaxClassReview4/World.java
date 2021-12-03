package com.syntaxClassReview4;

public class World {
    public static void main(String[] args) {

        MathTeacher math=new MathTeacher("John","Smith",40000,"math");
        //From Human
        math.printInfo();
        Human.sleep();
        Human.eat();

        //From Teacher

        math.getPaid();
        math.takeExam();

        //From MathTeacher
        // Compile Time PolyMorphism-
        // is achieved through METHOD OVERLOADING OR
        // STATIC OR EARLY BINDING
        math.speak();
        math.teach();

        //Run Time PolyMorphism
        // is achieved through METHOD OVERRIDING OR
        // (DYNAMIC OR LATE BINDING)

        double d=10;
        System.out.println("------- Object of Math but reference as of Parent=Human-----");
        //Casting of non Primitives : Upcasting and Downcasting
        Teacher teacher=new MathTeacher("Jane","Doe",4500,"math");
        teacher.getPaid();
        //Run time polymorphism --> during runtime JAVA executes method based on the objects type
        teacher.teach();

        teacher.takeExam();

        teacher.printInfo();

    }
}
