package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String firstInput = scanner.next().toLowerCase();
        System.out.print("Enter Your Department: ");
        String secondInput = scanner.next().toLowerCase();
        String message = "";

        if (firstInput.length()>=6 && secondInput.length()>=6){
            message = "Email Address is: " + firstInput.substring(0,4) +
                    secondInput.substring(secondInput.length()-3) + "@loopcamp.io";
        } else {
            message = "Invalid Data! Entries must be 6 or more digit...Try Again...";
        }
        System.out.println(message);
    }
}
