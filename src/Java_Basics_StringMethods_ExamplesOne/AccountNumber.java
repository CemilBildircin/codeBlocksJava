package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Account Number: ");
        String accountNum = scanner.next();
        String message = "";

        if (accountNum.startsWith("2") && accountNum.length() == 7) {
            message = "Valid 7-digit account number";
        } else if (accountNum.startsWith("5") && accountNum.length() == 10) {
            message = "Valid 10-digit account number";
        } else if (!(accountNum.startsWith("2")) || (!(accountNum.startsWith("5")))) {
            message = "Invalid account number";
        } else if (accountNum.length() == 1 || accountNum.length() > 10) {
            message = "Invalid account number length";
        } else {
            message = "Invalid account number";
        }

        System.out.println(message);
    }
}