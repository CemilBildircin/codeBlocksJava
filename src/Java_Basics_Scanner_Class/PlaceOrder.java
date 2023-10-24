package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Product Name: ");
        String productName = input.nextLine();
        System.out.print("Enter the Price: $ ");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.print("Costumer Full Name: ");
        String fullName = input.nextLine();
        System.out.print("\n" + fullName + " your order for " + quantity + " " + productName + " has been placed." +
                " Your total is $" + (price * quantity) + ".\n" );
    }
}
