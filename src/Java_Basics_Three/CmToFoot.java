package Java_Basics_Three;

import java.util.Scanner;

public class CmToFoot {
    public static void main(String [] args){


        Scanner scanCm = new Scanner(System.in);
        System.out.println("Enter the Height in cm: ");
        double cm = scanCm.nextDouble();
        double foot = 0.0328084;
        double conversion = cm * foot;
        System.out.println("Conversion result cm to foot: " + conversion);


    }
}
