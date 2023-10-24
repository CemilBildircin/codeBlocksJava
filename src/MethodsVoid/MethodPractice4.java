package MethodsVoid;

import java.util.Scanner;

public class MethodPractice4 {

    public static void threeNumTotal(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numFirst = scanner.nextInt();
        System.out.print("Enter second number: ");
        int numSecond = scanner.nextInt();
        System.out.print("Enter third number: ");
        int numThird = scanner.nextInt();

        if ( numFirst + numSecond + numThird == 180 ){
            System.out.println("This is a triangle");
        } else if ( numFirst + numSecond + numThird == 360 ){
            System.out.println("This is a circle");
        } else {
            System.out.println("This is not angle");
        }


    }

    public static void main(String[] args) {
        threeNumTotal();
    }

}
