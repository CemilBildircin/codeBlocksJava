package Abstraction.ExampleTwo;

public class Square extends Shapes{

    double side;
    @Override
    public void area() {
        double squareAreaResult = side * side;
        System.out.println("Square Area Result = "
                + squareAreaResult);
    }

    @Override
    public void perimeter() {
        double squarePerimeterResult = 4*side;
        System.out.println("Square Perimeter Result = "
                + squarePerimeterResult);

    }
}
