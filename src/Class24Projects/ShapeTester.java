package Class24Projects;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);

        Shape []shapes={new Circle(),new Square()};
        for(Shape s:shapes){
            s.calculatePerimeter(5);
            s.calculateArea(17.5);
        }

    }
}
