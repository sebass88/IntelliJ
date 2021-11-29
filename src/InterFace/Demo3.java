package InterFace;

public interface Demo3 {

    default void method(){
        System.out.println("I am a default method in Interface");
    }

    static void method2(){
        System.out.println("I am a static method in Interface");
    }
}
class DemoTester3 implements Demo3{

}

class Main{
    public static void main(String[] args) {
        Demo3.method2();
        //Demo3.method(); NOT ALLOWED FOR DEFAULT METHODS
        Demo3 demo3=new DemoTester3();
        demo3.method();
    }
}