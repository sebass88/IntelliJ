package Abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("132xl","Sedan","BMW","series x");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();

    }
}
