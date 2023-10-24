package MethodsReturn;

import java.util.Scanner;

public class CurrencyConverter {

    public static void currencyConverter() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Currency type: ");
        String currency = scanner.next().toLowerCase();
        System.out.print("Amount of currency: ");
        double amount = scanner.nextDouble();
        String message = "";

        switch (currency) {
            case "euro":
            message = currency+", " + amount + "\n" + (amount * .91) ;
            case "yen":
                message = currency+", " + amount + "\n" + (amount * 121.03) ;
            case "lira":
                message = currency+", " + amount + "\n" + (amount * 14.85) ;
            case "won":
                message = currency+", " + amount + "\n" + (amount * 1_217.52) ;
            case "rupee":
                message = currency+", " + amount + "\n" + (amount * 181.45) ;
        }

        System.out.println(message);
    }

    public static void main(String[] args) {
        currencyConverter();
    }
}
