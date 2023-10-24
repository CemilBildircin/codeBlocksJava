package Java_Basic_Calculation_Practices;

import java.util.Scanner;

public class InputOutputPractice {
    public static void main(String [] args){

        final double PI = 3.141592; // you can out PI during calculation with Math.PI formula.
        double radius, circumference, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        area = PI * Math.pow (radius,2); // or area= Math.PI * radius * radius;
        circumference = 2 * PI * radius; // or circumference = 2 * Math.PI * radius;
        System.out.println(String.format("Circumference of the Circle: " + String.format("%.2f", circumference) +
                "\nArea of the circle is: " + String.format("%.2f", area)));

    }
}
