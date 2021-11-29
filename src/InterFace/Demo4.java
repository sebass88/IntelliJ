package InterFace;

public interface Demo4 {
    void method();
    int age=18;
    static void method2(){
        System.out.println("I am method 2 from Demo4");
    }
}

interface I2{
    void method();
    int age=20;
    static void method2(){
        System.out.println("I am method 2 from Demo4");
    }
}

class Test implements Demo4,I2{

    @Override
    public void method() {
        System.out.println(I2.age);
        System.out.println("I will be called for both the methods from both Interfaces");
    }
}
class Main4{
    public static void main(String[] args) {
        Demo4 demo4=new Test();
        demo4.method();
        I2 i2=new Test();
        i2.method();
        Demo4.method2();
        I2.method2();
    }
}