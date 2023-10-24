package Java_Basics_Scanner_Class;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nHow old are you? : ");
        Scanner Input2 = new Scanner(System.in);
        byte age = input.nextByte();
        System.out.print("\nEnter your favorite number: ");
        long favNum = input.nextLong();
        boolean isStudent = age >= 18 && age <= 25;
        if (isStudent) {
            System.out.println("\nYou are a student...");
        } else {
            System.out.println("\nYou are not a student...");
        }
    }
}