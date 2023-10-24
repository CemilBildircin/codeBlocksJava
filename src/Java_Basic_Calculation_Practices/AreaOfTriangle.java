package Java_Basic_Calculation_Practices;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String [] args){

        double lengthSideA, lengthSideB, lengthSideC, area, sValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side A: ");
        lengthSideA = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        lengthSideB = scanner.nextDouble();
        System.out.println("Enter the length of side C: ");
        lengthSideC = scanner.nextDouble();

        sValue = (lengthSideA + lengthSideB + lengthSideC)/2;
        area = Math.sqrt(sValue) * (sValue - lengthSideA) * (sValue - lengthSideB) * (sValue - lengthSideC);
        System.out.println("Area: " + area );

    }
}
