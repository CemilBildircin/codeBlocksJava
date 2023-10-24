package MethodsVoid;

import java.util.Scanner;

public class MethodPractice3 {

    public static void findNumber (){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if ( num > 0 ){
            System.out.println( num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }


    }

    public static void main(String[] args) {

        findNumber();

    }



}
