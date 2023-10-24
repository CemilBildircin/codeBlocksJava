package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address: ");
        String address = scanner.nextLine().toUpperCase();
        String message = "";


        if (address.isBlank() || address.isEmpty()){
            message = "No address found !";
        } else{
            message = address;
        }
        System.out.println(message);
    }
}
