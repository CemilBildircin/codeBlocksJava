package Java_Practices_Three;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num;
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms of series: ");
        num = scanner.nextInt();

        System.out.println(firstTerm);

        for (int i = 3; i <= num; i++)
        {
            thirdTerm = firstTerm + secondTerm;
            System.out.println( thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}