package InterFace;

public class DriveableTester {
    public static void main(String[] args) {
        Driveable driveable=new Bike();
        driveable.drive();

        Driveable driveable1=new Car();
        driveable1.drive();

    }
}
