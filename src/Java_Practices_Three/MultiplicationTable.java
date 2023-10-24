package Java_Practices_Three;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();

        for (int i = 1; i <=10; i++) {

            System.out.println(num + " * " + i + " = " + num * i);

        }

        System.out.println( "++++++++++++++++++++++++++++++++++" ) ;

        // factorial
        int fact = 1 ;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial number of: " + num + " = " + fact);


    }

}

