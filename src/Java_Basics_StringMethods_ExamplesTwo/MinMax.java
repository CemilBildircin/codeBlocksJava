package Java_Basics_StringMethods_ExamplesTwo;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int i = 1;
       int result = 0;
       int minNumber = 2147483647;
       int maxNumber = -2147483647;

       while (i <= 5){
           System.out.print("Enter number: ");
            int input = scanner.nextInt();

            if (input < minNumber){
                minNumber = input ;
            }
           if (input > maxNumber){
               maxNumber = input;
           }
           i++;
       }
        System.out.println("Minimum Number is: " + minNumber + "\nMaximum Number is: " + maxNumber);
    }
}
