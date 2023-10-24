package Java_Practices_Three;

import java.util.Scanner;

public class FactorialCalc {
    public static void main (String [] args){

        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        long i;
        long factorial = 1;
        long input = scanner.nextInt();
        for ( i=1; i<= input; i++ )
        {
            factorial = factorial * i;
        }
        System.out.println("Output: " + factorial );
    }
}
