package Java_Practices_Three;

import java.util.Scanner;

public class SumOfOddAndEvens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = scanner.nextInt();

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Numbers: ");
            int num2 = scanner.nextInt();
            if (num2 % 2 == 0) {
                sumOfEven += num2;
            } else {
                sumOfOdd += num2;
            }
        }

        System.out.println("Sum of Odd numbers: " + sumOfOdd + " and Sum of Even Numbers: " +sumOfEven);
    }
}
