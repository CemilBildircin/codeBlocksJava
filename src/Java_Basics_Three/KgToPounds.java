package Java_Basics_Three;

import java.util.Scanner;

public class KgToPounds {
    public static void main(String [ ] args){
        System.out.print("Enter Kilogram Value: ");
        Scanner scanKilo = new Scanner(System.in);
        double kilogram = scanKilo.nextDouble();
        double pound = 2.20462;
        double conversion = kilogram * pound;
        System.out.println( kilogram + " kilogram equals to " + conversion + " pounds");

    }
}
