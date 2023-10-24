package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = scanner.next().toLowerCase().trim();
        System.out.print("Enter your lastname: ");
        String lastName = scanner.next().toLowerCase().trim();

        firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
        lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);

        System.out.println("Your full name is: " + firstName + " " + lastName);

    }
}

