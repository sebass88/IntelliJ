package Class24Projects;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.


    void calculateArea(double a);
    void calculatePerimeter(double a);
}
class Circle implements Shape{
    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of circle "+(Math.PI*Math.pow(radius,2)));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle "+(2*Math.PI*radius));
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double length) {
        System.out.println("Area of a square "+(length*length));
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("Perimeter of circle "+(4*length));
    }
}
