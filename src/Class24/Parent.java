package Class24;

public abstract class Parent {
    abstract void method1();
    abstract void method2();
}

abstract class Child extends Parent{
    @Override
    void method1() {
        System.out.println("Method 1 from Child  ");
    }
}

class Grandchild extends Child{
    @Override
    void method2() {
        System.out.println("Method 2 from Grandchild");
    }
}

class Tester{
    public static void main(String[] args) {
        Child child=new Grandchild();
        child.method1();
        child.method2();

    }
}
