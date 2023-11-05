package Custom_Classes;

public class Rectangle {

    double base,height, perimeter, area;
    @Override
    public String toString() {
        return "Rectangle" +
                "\nBase: " + base +
                "\nHeight: " + height +
                "\nPerimeter: " + perimeter +
                "\nArea: " + area;
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of the Rectangle-F is: "
                + (perimeter = (base + height) * 2));
    }
    public void calculateArea(){

        System.out.println("Area of the Rectangle-F is: "
                + (area = base * height));

    }
}


