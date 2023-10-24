package Java_Basics_Three;

import java.util.Scanner;

public class GallonToLiters {
    public static void main (String [] args) {
        Scanner scanGallon = new Scanner(System.in);
        System.out.print("Enter Gallon: ");
        double gallon = scanGallon.nextDouble();
        double liter = 3.78541;
        double conversion = gallon * liter;
        System.out.println( gallon + " gallon equals to " + conversion + " liters");

    }
    }
