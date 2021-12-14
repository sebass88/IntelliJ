package ReviewClass10;

public class Bike {
    static final int SPEED_LIMIT; // i can't change its value but it can be
    //inherited and can be overridden.
    static int baseLimit=20;
    static {
        SPEED_LIMIT=baseLimit+80; //initializer blocks we can use them to give initial values to the static fields
        //if we need to calculate the value of that field based on some complex formula
    }

    {
        // maxSeatingCapacity=200;  //initializer blocks we can use them to give initial values to the static fields
        //if we need to calculate the value of that field based on some complex formula
    }
    final int maxSeatingCapacity; // instance field we can also initialize it inside the constructor
    Bike(int maxSeatingCapacity ){
        this.maxSeatingCapacity=maxSeatingCapacity;
        //this.SPEED_LIMIT=_SPEED_LIMIT; // can't initialize the static final fields inside the constructor
    }
    static void run(){

        System.out.println("Honda Bike can run "+SPEED_LIMIT+" Km/h"); // Inheriting it
    }
}
class HondaBike extends Bike{
    //static int SPEED_LIMIT=200; //overriding it in the child class
    HondaBike(int maxSeatingCapacity){
        super(maxSeatingCapacity);
    }
    static void run(){
        //int SPEED_LIMIT=300;
        System.out.println("Honda Bike can run "+SPEED_LIMIT+" Km/h"); // Inheriting it
    }
}

class Main{
    public static void main(String[] args) {
        HondaBike hondaBike=new HondaBike(50);
        hondaBike.run();
    }
}
