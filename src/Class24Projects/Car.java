package Class24Projects;

public abstract class Car {

    //Create a Class Car that would have the following fields:
    // carPrice and color and method calculateSalePrice() which should be returning a price of the car.
    //Create 2 sub classes: Sedan and Truck.
    // The Truck class has field as weight and has its own implementation of  calculateSalePrice() method
    // in which returned price calculated as following:
    // if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

    double carPrice;
    String color;

    public abstract void calculateSalePrice();

    Car(double carPrice){
        this.carPrice=carPrice;
    }

}
class Truck extends Car{

    double weight;
    Truck(double carPrice,double weight){
        super(carPrice);
        this.weight=weight;
    }


    @Override
    public void calculateSalePrice() {
        if(weight>2000){
            System.out.println("Truck price with 10% discount is "+carPrice*0.1);
        }else{
            System.out.println("Truck price with 20% discount is "+ carPrice*0.2);
        }

    }
}
class Sedan extends Car{
    double length;
    Sedan(double carPrice,double length){
        super(carPrice);
        this.length=length;
    }

    @Override
    public void calculateSalePrice() {
        if(length>20){
            System.out.println("the sedan price with 5% discount is "+carPrice*0.05);
        }else{
            System.out.println("the sedan price with 10% discount is "+carPrice*0.1);
        }
    }
}