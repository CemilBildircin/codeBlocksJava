package Java_Basics_StringMethods_ExamplesTwo;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        long calcFact = scanner.nextLong(); // user input for calculation
        long fact = 1; // this is a constant value for calculation
        long i = 1; // initialization value for while loop

        while (calcFact >= 1) {
            System.out.println(fact + " * " + calcFact + " = " + fact * calcFact); // calculation process
            fact = fact * calcFact;
            calcFact--;
        }
        System.out.println("Result: " + fact);
    }
}