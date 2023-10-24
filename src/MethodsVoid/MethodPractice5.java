package MethodsVoid;

import java.util.Scanner;

public class MethodPractice5 {

    public static void stringToChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        stringToChar();
    }
}
