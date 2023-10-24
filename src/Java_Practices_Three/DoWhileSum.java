package Java_Practices_Three;

import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {


        char answer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Number 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = scanner.nextInt();
            System.out.println("Sum of your numbers: " + (num1 + num2));
            System.out.println("Do you want to continue? Y-N : ");
            answer = scanner.next().charAt(0);

        } while (answer == 'y' || answer == 'Y');
    }

    {

    }
}


