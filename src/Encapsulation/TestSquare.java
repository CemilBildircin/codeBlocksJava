package Encapsulation;

public class TestSquare {
    public static void main(String[] args) {

        Square s1 = new Square(-12.5);
        System.out.println("Area of S1 Square= " + s1.CalculateArea());
        System.out.println("Perimeter of S1 Square = " + s1.CalculatePerimeter());
        System.out.println();
        System.out.println(s1);
    }
}
