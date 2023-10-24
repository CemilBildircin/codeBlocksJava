package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter a number: ");
        int num = input.nextInt();
        boolean even = num / 2 == 0, odd = num / 2 != 0;
        System.out.println(num + " is even: " + even +"\n" +
                           num + " is odd: " + odd );

    }
}
