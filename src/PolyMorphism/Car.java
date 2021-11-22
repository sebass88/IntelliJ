package PolyMorphism;

public class Car {

    void start(){
        System.out.println("Use keys to start me");
    }

    void stop(){
        System.out.println("Use brake to stop me");
    }

    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("Use the button to start me ");
    }

}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Use mobile app to start me");
    }
}
class Toyota extends Car{

}