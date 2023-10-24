package Java_Practices_Three;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if ( num % i == 0 ){
                isPrime = false;
                break;
            }
        }
        if ( isPrime && num > 1 ){
            System.out.println( num + " is a Prime Number" );
        } else {
            System.out.println( num + " is NOT a Prime Number");
        }
    }
}
