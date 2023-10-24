package Java_Practices_Three;

import java.util.Scanner;

public class HcfOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dividend, divisor;
        int remainder = 0 , hcf = 0;
        System.out.print("Enter the first number ");
        dividend = scanner.nextInt();
        System.out.print("Enter the second number ");
        divisor = scanner.nextInt();

        if ( dividend / divisor != 0 );{
            do {
                hcf = dividend * divisor;
                System.out.println("HCF " + hcf);
            }while (dividend / divisor != 1);

        }

    }
}

