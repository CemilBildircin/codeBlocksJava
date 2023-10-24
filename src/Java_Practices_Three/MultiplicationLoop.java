package Java_Practices_Three;

import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner object
        int num;        // num variable is an int
        System.out.print("Enter any positive integer: "); // ask user an input
        num = scanner.nextInt(); // declare a value to num from input

        System.out.println("Multiplication Table of " + num); // print statement body

        for(int i=1; i<=10; i++)  //
            {
            System.out.println(num + " x " + i + " = "  + (num*i) );
            }
    }
}