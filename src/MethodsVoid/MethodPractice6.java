package MethodsVoid;

import java.util.Scanner;

public class MethodPractice6 {

    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.next().toLowerCase().trim();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println( str + " is a Palindrome");
        } else {
            System.out.println( str + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}
