package ReviewClass10;

public interface Drawable {
     //final void draw();// Added by the compiler automatically/ We can't use Final with method
     //private void draw(); private and protected access modifiers are Not Allowed
    //static void draw(); static keyword is also not allowed
    //int paperSize; can't leave fields as un-initialized because fields are final
    //abstract int paperSize=12; abstract keyword is not allowed with fields anywhere
    //private int paperSize=12; private and
    int paperSize=12;// interface fields are public static and final by default
    // we don't have constructors in the interfaces because there are no instance fields
    void draw();
    static void staticMethod(){
        System.out.println("I am a static method inside an interface");
    }
    default void defaultMethods(){
        System.out.println("I am a default method");
    }
}
class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
