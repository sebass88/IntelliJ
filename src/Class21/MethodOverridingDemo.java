package Class21;

import java.util.concurrent.Callable;

public class MethodOverridingDemo {

    void method(int num){
        System.out.println("From Parent");
    }
}
class Child extends MethodOverridingDemo{
     @Override
    void method(int num){
        System.out.println("From child");
    }
    //@Override
   // void method(int num){
      //  System.out.println(num);// Can't decrease the visibility
    }
    //@Override
    //public void method(int num) {
      //  System.out.println(num);// can't decrease the visisbilty
//}



class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.method(10);
        };
    }
