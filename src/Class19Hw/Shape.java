package Class19Hw;

public class Shape {

   // Write program: Shape class has a constructor that takes the radius and
    // has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle.
    // Test your code

    double radius;
    Shape(double radius){
        this.radius=radius;
    }

}


class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void calculate(){
        double area=Math.PI*radius*radius;
        System.out.println(area);
    }


}


