package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Objects;
import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        int totalBalance = 100;
        int blanketP = 60;
        int chargerP = 25;
        int hatP = 25;
        int headPhonesP = 30;
        int laptopP = 200;
        int pantsP = 50;
        int pillowP = 40;
        int smartPhoneP = 1000;
        int socksP = 5;
        int usbCableP = 10;

        String smartphone = "Smart Phone";
        String blanket = "Blanket";
        String charger = "Charger";
        String hat = "Hat";
        String headPhones = "Head Phone";
        String laptop = "Laptop";
        String pants = "Pants";
        String pillow = "Pillow";
        String socks = "Socks";
        String usbCable = "USB";

        // if item is not on list display message: "Invalid item"
        // if price more then 100$ display message: "Sorry, not enough funds on your gift card!"

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of the item: ");
        String itemName = input.nextLine();
        if (Objects.equals(itemName, blanket)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - blanketP));
        } else if (Objects.equals(itemName, charger)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - chargerP));
        } else if (Objects.equals(itemName, hat)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - hatP));
        } else if (Objects.equals(itemName, headPhones)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - headPhonesP));
        } else if (Objects.equals(itemName, usbCable)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - usbCableP));
        } else if (Objects.equals(itemName, pants)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - pantsP));
        } else if (Objects.equals(itemName, pillow)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - pillowP));
        } else if (Objects.equals(itemName, socks)) {
            System.out.println("Thank you for your purchase!" + "\nYour current balance is: $" + (totalBalance - socksP));
        } else if (Objects.equals(itemName, laptop)) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (itemName != blanket || itemName != charger || itemName != hat || itemName != headPhones || itemName != usbCable ||
                itemName != pants || itemName != pillow || itemName != socks) {
            System.out.println("Invalid Item !");
        }

    }
 }

