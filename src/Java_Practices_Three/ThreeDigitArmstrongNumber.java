package Java_Practices_Three;

import java.util.Scanner;

public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        int ones = num % 10;
        int hundreds = num / 100;
        int temporary = num % 100;
        int tens = temporary / 10;

        int armStrong = (ones * ones * ones) + (tens * tens * tens) + (hundreds * hundreds * hundreds);

        if(armStrong == num){
            System.out.println(num + " is an Armstrong number");
        } else System.out.println(num + " is not an Armstrong number");

    }
}

