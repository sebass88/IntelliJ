package Class21;

public class MethodOverloadingDemo {

   // void method(int number) {
      //  System.out.println(number);
   // }
    //public void method(int num){
       // System.out.println(num);
       // System.out.println("hello");
       // System.out.println("Java");
    // Can not overload by just changing the access modifier
   // }

   // static void method(int number) {
     //   System.out.println(number);
     //   System.out.println("Hello");
     //   System.out.println("Java");
      //  Can not overload by just non access modifier
   // }
    //int method(int number) {
      //  System.out.println(number);
       // System.out.println("Hello");
      //  System.out.println("Java");
       // can not overload by just changing the return type
   // }

    void method(int number) {
        System.out.println(number);
    }
    void method(String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");

    }
    void method(String name,int num) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");

    }
    void method(int num,String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");

    }


    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.method(10);
        md.method("Sharif");
        md.method(10,"Sharif");
    }
}