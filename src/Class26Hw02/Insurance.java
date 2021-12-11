package Class26Hw02;

public abstract class Insurance {

    //Create a class Insurance that will have an
    // attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health.
    // Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    // Create 3 objects of the sub classes and store them in ArrayList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.

    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;


    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{

    String carModel;
    Car(String carModel,String insuranceName){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("This "+ carModel + " quote is");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+ " insurance for this "+carModel+" has been cancelled");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String petType,String insuranceName){
        super(insuranceName);
        this.petType=petType;

    }

    @Override
    void getQuote() {
        System.out.println("To get a quote for this "+petType+" is");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" insurance for this "+petType+" has been cancelled");
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("We need "+insuranceName+" to get a quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been cancelled");
    }

}
