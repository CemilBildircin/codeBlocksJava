package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class UserAndPass {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = scanner.next().toLowerCase().trim();
        System.out.print("Enter your password: ");
        String password = scanner.next();
        String message = "";

        if (password.length() < 5){
            message = "Password cannot be less than 5 characters";
        } else if (password.length() >= 5 ){
            message = "Valid Password";
        }
        if (password.contains(userName)){
            message = "Invalid password, username should not be in it";
            password = "password";
        }
        System.out.println(message);
    }
}
