package Abstraction.ExampleTwo;

public class Circle extends Shapes{


    double radius;
    static double PI=3.14;
    @Override
    public void area() {
        double circleAreaResult = radius * radius * PI;
        System.out.println("Circle Area Result = "
                + circleAreaResult);

    }

    @Override
    public void perimeter() {
       double circlePerimeterResult = 2 * PI * radius;
        System.out.println("Circle Perimeter Result = "
                + circlePerimeterResult);
    }
}
