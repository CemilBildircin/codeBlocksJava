package Java_Practices_Three;

import java.util.Scanner;


public class PickNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;
        char choice;

        do {
            System.out.print("Enter the number: ");
            int input = scanner.nextInt();

            if (input > 0){
                countPositive++;
            }
            else if (input < 0){
                countNegative++;

            } else if ( input == 0) {
                countZero++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // valid entry values. any other input will stop the run.

        System.out.println("\nPositive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);

    }
}
