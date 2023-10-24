package Day02Tasks;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimme First Number: ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Gimme Second Number: ");
        float secondNumber = scanner.nextFloat();

        float product = firstNumber * secondNumber;

        System.out.print("There you have it: " + product);

    }
}
