package Abstraction;

public abstract class Vehicle {
    //abstract String vin_number; Abstract NOT ALLOWED WITH FIELDS.
    String vinNumber;
    static int totalVehicles;
    /*abstract Vehicle(){
         abstract not allowed with CONTRUCTORS
     */
    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpas constructor is called");
    }

    public void printVehicleCount(){
        System.out.println(totalVehicles+" Vehicle creating ");
    }
    public void drive(){
        System.out.println(" Vehicle is driving ");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();
}

abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent contructor is called");
    }
    public void drive(){
        System.out.println("car is driving");
    }
    public abstract void speed();
}

class BMW extends Car{
    String make;
    String model;
    BMW(String vinNumber,String carType,String model,String make){
        super(carType,vinNumber);
        this.make=make;
        this.model=model;
    }
    @Override
    public void speed() {
        System.out.println("BMW can run 300km/mph");
    }

    @Override
    public void start() {
        System.out.println("BMW can start using remote");
    }
}
class Toyota extends Car{
    String make;
    String model;
    Toyota(String vinNumber,String carType, String model){
        super(carType,vinNumber);
        this.make=make;
        this.model=model;
    }
    @Override
    public void speed() {
        System.out.println("Toyota  can run 200km/mph");
    }

    @Override
    public void start() {
        System.out.println("Toyota can start using keys");
    }
    void displayInfo(){
        System.out.println("we build "+make+" model"+model+" "+carType+" "+vinNumber);
    }
}
