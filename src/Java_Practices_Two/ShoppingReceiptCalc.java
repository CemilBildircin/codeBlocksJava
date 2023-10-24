package Java_Practices_Two;

import java.util.Scanner;

public class ShoppingReceiptCalc {
    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("       WELCOME TO THE STORE");
        System.out.println("************************************");

        System.out.println("__________________________________");
        float cake;
        float water;
        float appleJuice;
        float bread;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Cake:\t");
            cake = scanner.nextFloat();
            System.out.print("Water:\t");
            water = scanner.nextFloat();
            System.out.print("Apple Juice:");
            appleJuice = scanner.nextFloat();
            System.out.print("Bread:\t");
            bread = scanner.nextFloat();
        }
        System.out.println("__________________________________");

        double totalAmount = cake + water + appleJuice + bread;
        double tax = 0.1 * totalAmount;
        double grandTotal = totalAmount + tax;


        System.out.println(String.format("Total Amount\t$ %.2f", totalAmount));
        System.out.println(String.format("Tax\t\t\t\t$ %.2f", tax));
        System.out.println(String.format("Grand Total\t\t$ %.2f", grandTotal));

        System.out.println("__________________________________");
        System.out.println("********* THANK YOU *********");


    }
}
