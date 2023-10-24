package Java_Basics_If_Statement;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
            long numA = input.nextLong();
        System.out.print("Second Number: ");
            long numB = input.nextLong();
        System.out.print("Third Number: ");
            long numC = input.nextLong();

        if ( numA > numB && numA > numC ){
            System.out.println("The greatest number of " + numA + ", " + numB + ", " + numC + ", " + " is: " + numA );
        }
        if ( numB > numA && numB > numC){
            System.out.println("The greatest number of " + numA + ", " + numB + ", " + numC + ", " + " is: " + numB );
        }
        if ( numC > numA && numC > numB ){
            System.out.println("The greatest number of " + numA + ", " + numB + ", " + numC + ", " + " is: " + numC );
        }

    }
}
