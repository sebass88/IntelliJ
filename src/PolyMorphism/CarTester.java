package PolyMorphism;

public class CarTester {
    public static void main(String[] args) {


        Car[]cars={new BMW(),new Tesla(),new Toyota()};
        for(Car car:cars){
            car.start();
            car.stop();
            car.park();
        }

    }
}
