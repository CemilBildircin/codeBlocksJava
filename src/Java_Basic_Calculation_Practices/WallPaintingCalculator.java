package Java_Basic_Calculation_Practices;

import java.util.Scanner;

public class WallPaintingCalculator {
    public static void main (String [] args){

        double length, width, height, areaOfWall1, areaOfWall2, totalArea, areaOfFloor,
                areaOfDoors, areaOfWindows, requiredPaint;
        int numberOfDoors, numberOfWindows;

        // ceiling and floor not calculated. Only for walls...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of the room: ");
            length = scanner.nextDouble();
        System.out.println("Width of the room: ");
            width = scanner.nextDouble();
        System.out.println("Height of the room: ");
            height = scanner.nextDouble();
        System.out.println("How many doors in the room: ");
            numberOfDoors = scanner.nextInt();
        System.out.println("How many windows in the room: ");
            numberOfWindows = scanner.nextInt();
        areaOfWall1 = 2* (length * height);
        areaOfWall2 = 2* (width * height);
        areaOfDoors = numberOfDoors * 20;
        areaOfWindows = numberOfWindows * 15;
        totalArea = areaOfWall1 + areaOfWall2 - areaOfDoors - areaOfWindows;
        requiredPaint = totalArea / 350;
        System.out.println("Paint required: " + String.format("%.2f", requiredPaint) + "gallons." );



    }
}
