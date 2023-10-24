package Java_Basics_If_Statement;

import java.util.Scanner;

public class OceanTank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your current oxygen level in your tank?: ");
        int o2Level = input.nextInt();
        if (o2Level >= 90) {
            System.out.print("\nYour tank is full...");
        }
        if (o2Level >= 80 && o2Level <=89) {
            System.out.print("\nOxygen level is still OK");
        }
        if (o2Level >= 70 && o2Level <= 79) {
            System.out.print("\nDo not go deeper!");
        }
        if (o2Level >= 60 && o2Level <= 69) {
            System.out.print("\nStart to head back!");
        }
        if (o2Level >= 50 && o2Level <= 59) {
            System.out.print("\nBe careful now you are at 50%");
        }
        if (o2Level < 50){
            System.out.println("Danger zone...");
        }
    }
}
