package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println(num2 + " is smaller than " + num1);
        } else if ( num2 > num1){
            System.out.println(num1 + " is smaller than " + num2);
        } else if ( num2 == num1){
            System.out.println(num1 + " is equal to " + num2);
        }

    }
}
//    Ask user to input two numbers
//    and write a code to evaluate and check if they are equal, one which one is bigger
//
//        Ex:
//        Enter 2 number:
//        5
//        6
//        5 is smaller than 6