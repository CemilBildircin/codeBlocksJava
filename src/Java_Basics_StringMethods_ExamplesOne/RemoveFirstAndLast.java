package Java_Basics_StringMethods_ExamplesOne;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words:");
        String str1 = scanner.next().toLowerCase().trim();
        String str2 = scanner.next().toLowerCase().trim();
        int str2Length = str2.length();
        scanner.close();
        System.out.println("Your input: " + str1 + ", " + str2 + "\nJava's Output: " + str1.substring(1)
                + ", " + str2.substring(0, str2Length - 1));
    }
}