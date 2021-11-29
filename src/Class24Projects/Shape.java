package Class24Projects;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.

    double radius=8;
    double a= 4;
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println(" the area of a circle is "+Math.PI*Math.pow(radius,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("the perimeter of a circle is "+ Math.PI*(2*radius));
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("the area of a square is "+Math.pow(a,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("the perimeter of a square is "+a*4);
    }
}
