package MethodsVoid;

import java.util.Scanner;

public class MethodPractice7 {

    public static void sumOfNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        int result = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        for (int elements : nums) {
            result += elements;
        }
        System.out.println("Sum of the numbers: " + result);


    }

    public static void main(String[] args) {
        sumOfNumbers();
    }

}
