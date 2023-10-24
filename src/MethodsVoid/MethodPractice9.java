package MethodsVoid;

import java.util.Arrays;
import java.util.Scanner;

public class MethodPractice9 {

    public static void evenAndOdd() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the first List: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Size of the second List: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        int[] even = new int[size1];
        int[] odd = new int[size2];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter number " + (i + 1) + " for the first list: ");
            arr1[i] = scanner.nextInt();
            if (arr1[i] % 2 == 0) {
                even[i] = arr1[i];
            }
        }
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter number " + (i + 1) + " for the second list: ");
            arr2[i] = scanner.nextInt();
            if (arr2[i] % 2 != 0) {
                odd[i] = arr2[i];
            }
        }
        System.out.println( Arrays.toString(arr1) + Arrays.toString(even));
        System.out.println( Arrays.toString(arr2) + Arrays.toString(odd));

    }

    public static void main(String[] args) {
        evenAndOdd();
    }
}
