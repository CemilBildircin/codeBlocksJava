package Java_Basics_StringMethods_ExamplesTwo;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number; ");
        int input = scanner.nextInt();
        int i = 0;
        while (true) {
            System.out.print("Enter another number or Negative Number to Exit: ");
            int nextInput = scanner.nextInt();
            input += nextInput;
            if (nextInput < 0) {
                break;
            }
        }
        System.out.println(input);
    }
}

