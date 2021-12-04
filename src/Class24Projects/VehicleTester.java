package Class24Projects;

public class VehicleTester {
    public static void main(String[] args) {
        Truck truck=new Truck(15000,1000);
        truck.calculateSalePrice();

        Sedan sedan=new Sedan(45000,25);
        sedan.calculateSalePrice();
    }
}
