package Java_Practices_One;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 1 || num % 2 == 0) {
            System.out.println(num + " is Not a Prime Number");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    System.out.println(num + " is a Prime Number");
                }
            }
        }
    }
}

/*
Give a number determine if it is a prime number.
A prime number is a number that is only divisible by 11 and itself.

                Ex:
                    Input:
                        11
                       Output:
                        prime

                     Ex:
                    Input:
                        10
                    Output:
                   not prime
 */