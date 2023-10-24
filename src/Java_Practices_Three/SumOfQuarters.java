package Java_Practices_Three;

import java.util.Scanner;

public class SumOfQuarters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextInt();
        double result = 0;

        for (int i = 1; i <= num; i++) {

            result = result + 1.0 / i;
        }

        System.out.println(String.format("%.2f", result));

    }
}
