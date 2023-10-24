package Java_Basics_If_Statement;

import java.util.Scanner;

public class IfStatementOperatorsTask2 {
    public static void main(String[] args) {



        System.out.println("Task A");
        Scanner inputA = new Scanner(System.in);
        System.out.print("Please enter value of \"y\" - ");
        int y = inputA.nextInt();

        if (y==20) {
            int x = 5;
            System.out.println("Value of \"x\" is equal to "+x);
        } else {
            System.out.println("Try again!");
        }

        System.out.println("=========================\nTask B");
        Scanner inputB = new Scanner(System.in);
        System.out.print("Please enter a boolean variable - ");
        boolean max = inputB.nextBoolean();

        if (max) {
            int fee = 50;
            System.out.println("Value of variable fee is equal to: "+fee);
        }
        else {
            System.out.println("Boolean variable is not true.");
        }



        System.out.println("=========================\nTask C");
        Scanner inputC = new Scanner(System.in);
        System.out.print("Please enter value of \"b\" - ");
        int b = inputC.nextInt();
        System.out.print("and value of \"c\" - ");
        int c = inputC.nextInt();

        if (b==50 && c>=100) {
            int a = 20;
            System.out.println("Value of variable \"a\" is equal to: "+a);
        }
        else {
            System.out.println("Values are different than required.");
        }

        System.out.println("=========================\nTask D");
        Scanner inputD = new Scanner(System.in);
        System.out.print("Please enter temperature - ");
        int temp = inputC.nextInt();

        if (temp >= 70 && temp<=80) {
            System.out.println(temp+"F - ideal temperature!");
        }
        else {
            System.out.println("The temperature causes discomfort!");
        }
    }
}