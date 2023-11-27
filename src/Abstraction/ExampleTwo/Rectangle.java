package Abstraction.ExampleTwo;

public class Rectangle extends Shapes {

    double width, length;
    @Override
    public void area() {
        double rectAreaResult = width * length;
        System.out.println("Rectangle Area Result = "
                + rectAreaResult);
    }
    @Override
    public void perimeter() {
        double rectPerimeterResult = 2 * (width + length);
        System.out.println("Rectangle Perimeter Result = "
                + rectPerimeterResult);
    }
}
