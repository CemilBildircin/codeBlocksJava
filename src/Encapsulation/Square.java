package Encapsulation;

public class Square {

    public double side;

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Side value must be positive...");
            System.out.println("Try again...");
        }
    }
    public Square(double side) {
        setSide(side);
    }

    public double CalculateArea() {
        return (side * side);
    }

    public double CalculatePerimeter() {
        return (side * 4);
    }

    @Override
    public String toString() {
        return "Details of the Square" +
                "\n\tSide of the Square: " + side +
                "\n\tPerimeter of the Square: " + CalculateArea() +
                "\n\tArea of the Square: " + CalculatePerimeter();

    }

}
