package com.syntaxReviewClass3;

import com.syntaxReview2.Doctor;

public class Dentist extends Doctor {

    String certificate;
    String office;

    public Dentist(String name, String lastName,String speciality){

        super(name,lastName,speciality);
    }
    public Dentist(String name, String lastName,String speciality,String certificate,String office){
        super(name,lastName,speciality);
        this.certificate=certificate;
        this.office=office;
    }

    public void haveCertificate(){
        System.out.println(name +" has a dentist certificate");
    }

    //OVERLOAD
    //2 METHODS WITHIN THE SAME CLASS HAVE SAME NAME--> OVERLOAD
    //TO OVERLOAD WE NEED(METHOD SIGNATURE MUST BE DIFFERENT) (NAME AND PARAMETERS)
    //    1. CHANGE THE NUMBER OF THE PARAMETERS
    //    2. CHANGE THE TYPE OF THE PARAMETERS

    public void haveOffice(){
        System.out.println(name+" has 1 office ");
    }

    public void haveOffice(String state){
        System.out.println(name+" has a 2nd office");
    }


    public static void main(String[] args) {
        Dentist doe=new Dentist("Jack","Doe","Dentist");
        doe.printInfo();
        doe.treatPatient("Jane");
        //doe.work(); DEFAULT
        //doe.getpaid(); PRIVATE
        //doe.think(); comes from HUMAN CLASS(Grandparent)
        doe.haveCertificate();// comes from Dentist (its own class)
        doe.haveOffice();
        doe.haveOffice("Va");
    }
}
