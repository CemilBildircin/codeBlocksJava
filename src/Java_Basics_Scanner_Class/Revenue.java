package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class Revenue {
    public static void main (String [] args){

        double revenue, price, quantity;
                Scanner input1 = new Scanner(System.in);
        System.out.print("\nEnter product price: $ ");
        price = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter product quantity: ");
        quantity = input2.nextDouble();
        revenue = price * quantity;
        System.out.print("Revenue: $" + String.format("%.2f", revenue) +"\n");




    }
}
