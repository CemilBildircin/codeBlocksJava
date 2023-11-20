package Encapsulation;

public class Rectangle {

    public int length, width;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }
    public void setLength(int length) {
        if ( length > 0 ){
            this.length = length;
        } else {
            System.out.println("Length must be a positive number...");
        }
    }
    public void setWidth(int width) {
        if ( width > 0  ){
            this.width = width;
        } else {
            System.out.println("Width must be a positive number...");
        }
    }
    public int CalculateArea() {
        return (length * width);
    }
    public int CalculatePeri() {
        return (length * width) * 2;
    }
    @Override
    public String toString() {
        return "Details of Rectangle" +
                "\n\tLength= " + length +
                "\n\tWidth= " + width +
                "\n\tPerimeter= " + CalculatePeri() +
                "\n\tArea=" + CalculateArea();
    }
}