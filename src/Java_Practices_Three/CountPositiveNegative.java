package Java_Practices_Three;

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {

        char answer;
        int countPos = 0, countNeg = 0, countZero = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                countPos++;
            } else if (num == 0) {
                countZero++;
            } else {
                countNeg++;
            }
            System.out.println("Do you wanna continue?");
            answer = scanner.next().charAt(0);

        } while (answer == 'y' || answer == 'Y');
        {

            System.out.println("Positive numbers counter: " + countPos + " Negative numbers counter: " + countNeg +
                    " Zero counter: " + countZero);
        }

    }
}

