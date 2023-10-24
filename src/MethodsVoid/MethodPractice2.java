package MethodsVoid;

import java.util.Scanner;

public class MethodPractice2 {

    public static void eligibleToVote() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

    }

    public static void main(String[] args) {
        eligibleToVote();
    }
}
