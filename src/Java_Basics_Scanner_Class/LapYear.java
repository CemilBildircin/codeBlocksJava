package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class LapYear {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a Year: ");
        int year = input.nextInt();
        boolean leapYear = year % 4 ==0;
        if (leapYear){
            System.out.println( "\nJack Pot! " + year + " is a Leap Year." );
        }
        else {
            System.out.println( "\nSorry, " + year + " is not a Leap Year.");
        }

    }
}
