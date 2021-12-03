package com.syntaxClassReview4;

public abstract class Teacher extends Human {
    protected double salary;

    public Teacher(String name,String lastname,double salary){
        super(name,lastname);
        this.salary=salary;
    }
    public void teach(){
        System.out.println("Every Teacher teach");
    }
    public void getPaid(){
        System.out.println("Teacher gets paid "+salary);
    }

    public abstract void takeExam();

}
class MathTeacher extends Teacher{
    String subject;

    public MathTeacher(String name,String lastname, double salary,String subject){
        super(name, lastname, salary);
        this.subject=subject;
    }
    // Rules of OVERLOADING:
    //1. Method signature must be different
    //2. Return type CAN BE different
    //3.Access modifiers CAN be diffirent
    //4.We can overload private
    //5.We can overload static method
    public void speak(String language){
        System.out.println(name+" "+lastname+ "speaks math and "+language+" language");
    }
    public void speak(){
        System.out.println(name+ " "+lastname+" speaks math language");

    }
    public void takeExam() {
        System.out.println(name+" "+lastname+" takes exam on "+subject);
    }
    public void hasVacation(){
        System.out.println(name+" "+lastname+ "has 30 days vacation");
    }

    @Override //OVERRIDING TEACH METHOD
    public void teach() {
        System.out.println(name+" teaches "+subject);
    }
    /*
    Rules of overriding
    1. Inheritance
    2.Method signature (name+parameters) + return type MUST be sam
    3.Access modifiers cannot be more restrictive
    4,Cannot override Private
     */
}
