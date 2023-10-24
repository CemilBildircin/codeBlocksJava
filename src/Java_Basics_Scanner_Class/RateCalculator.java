package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        double salary, hourRate;
        byte weeklyHour = 40;
        final byte weeks = 52;
        System.out.print("\nEnter your salary: $");
        salary = input.nextDouble();
        hourRate = salary / (weeklyHour * weeks);
        System.out.println("Hourly rate of employee: $ " + String.format("%.2f", hourRate));

    }
}
