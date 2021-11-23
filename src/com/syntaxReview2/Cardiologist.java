package com.syntaxReview2;

public class Cardiologist extends Doctor {

    public Cardiologist(String name,String lastName,String speciality){
        super(name,lastName,speciality);
    }


    public static void main(String[] args) {
        Cardiologist smith=new Cardiologist("John","Smith","Cardiologist");
        smith.printInfo();
        smith.treatPatient("jack");
        smith.work();
        //smith.getPaid(); PRIVATE DON;T PARTICIPATE IN THE
        //
    }
}
