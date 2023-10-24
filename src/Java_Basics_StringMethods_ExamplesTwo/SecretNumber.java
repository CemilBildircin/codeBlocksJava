package Java_Basics_StringMethods_ExamplesTwo;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        int secretNum = 49;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the Secret Number: ");

        while (true) {
            int guessNum = scanner.nextInt();
            counter++;
            if (guessNum == secretNum) {
                System.out.println("You guessed correctly!");
                break;
            } else if (guessNum > secretNum) {
                System.out.print("too high,try new number: ");
            } else if (guessNum < secretNum) {
                System.out.print("too low, try new number: ");
            }
        }
        System.out.println("I took you " + counter + " times to guess correct value!");
    }
}
