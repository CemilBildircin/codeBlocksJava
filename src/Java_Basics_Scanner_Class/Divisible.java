package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the Number: ");
        int num = input.nextInt();
        boolean numDivisibleByTwo = num % 2 == 0, numDivisibleByThree = num % 3 == 0, numDivisibleByFive = num % 5 == 0;
        if (numDivisibleByTwo){
            System.out.println( "\n" + num + " is divisible by 2.");}
        else {System.out.println("\n" + num + " is not divisible by 2.");}

        if (numDivisibleByThree){
            System.out.println("\n" + num + " is divisible by 3.");}
        else {System.out.println("\n" + num +" is not divisible by 3." );}

        if (numDivisibleByFive){
            System.out.println("\n" + num + " is divisible by 5." );}
        else {System.out.println("\n" + num + " is not divisible by 5.");}


    }
}
