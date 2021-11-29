package Class24Projects;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculateArea();
        shape.calculatePerimeter();

        Shape shape1=new Square();
        shape1.calculateArea();
        shape1.calculatePerimeter();

        System.out.println("--------------------------------");

        Shape [] shapes={new Square(),new Circle()};
        for(Shape shape2:shapes){
            shape2.calculatePerimeter();
            shape2.calculateArea();
        }
    }
}
