package com.syntaxReview2;

public class Hospital {
    public static void main(String[] args) {

        Doctor doctor1=new Doctor("John","Smith","dentist",20000);
        Doctor.hospital="Inova";
        doctor1.printInfo();
        doctor1.work();


        Doctor doctor2=new Doctor("jane","smith","cardiologist");
        doctor2.work();
        // Change will affect all instances
        doctor2.hospital=" Jw Hospital";

        System.out.println();
        doctor2.work();
        doctor1.work();

        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);

        //accessing static method

        Doctor.companyName();

        doctor1.treatPatient("James");
        doctor2.treatPatient("Anna");

    }
}
