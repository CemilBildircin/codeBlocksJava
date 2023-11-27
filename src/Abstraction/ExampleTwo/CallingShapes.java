package Abstraction.ExampleTwo;

public class CallingShapes {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.radius = 5.6;
        circle1.area();
        circle1.perimeter();
        System.out.println("----");

        Square square1 = new Square();
        square1.side = 6;
        square1.area();
        square1.perimeter();
        System.out.println("------");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 8;
        rectangle1.width = 8;
        rectangle1.area();
        rectangle1.perimeter();




    }
}
