package com.syntaxReview2;

public class Doctor {

    String name;
    String lastName;
    String specialty;
    double salary;
//    static variable
    static String hospital;

     // CONSTRUCTOR
    Doctor(String name,String lastName,String specialty,double salary){
        this.name=name;
        this.lastName=lastName;
        this.specialty=specialty;
        this.salary=salary;
    }
    //CONSTRUCTOR
    Doctor(String name,String lastName,String specialty){
        this.name=name;
        this.lastName=lastName;
        this.specialty=specialty;

    }

    void treatPatient(String name){
        System.out.println("Doctor "+this.name+" treats patient "+name);
    }

    void printInfo(){
        System.out.println(name+" "+lastName+" is a"+specialty);
    }

    void work(){
        System.out.println(name+" works at hospital"+hospital);
    }
    void getpaid(){

        System.out.println(name+" gets paid "+salary);
    }

    // Static can work only with static

    static void companyName(){
        System.out.println("all doctors work at"+hospital);
    }

}
