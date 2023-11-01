package Wrapper_Class;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        // min 8 car
        // min 1 upper
        // min 1 lower
        // min 1 number
        // min 1 special char
        isValidPassword();
    }

    public static void isValidPassword() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.next();
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int speChar = 0;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char eachLetter = password.charAt(i);
                if (Character.isUpperCase(eachLetter)) {
                    upperCase++;
                } else if (Character.isLowerCase(eachLetter)) {
                    lowerCase++;
                } else if (Character.isDigit(eachLetter)) {
                    digit++;
                } else {
                    speChar++;
                }
            }
            if ( upperCase > 0 && lowerCase > 0 & digit >0 && speChar >0 ){
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password ! Try Again...");
            }
        }
    }
}
