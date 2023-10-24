package MethodsVoid;

import java.util.*;

public class MethodPractice8 {

    public static void isArrayContainsNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the list: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        boolean found = false;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.print("What number are you looking for? ");
        int searchNum = scanner.nextInt();

        for ( int elements : nums){
            if ( elements == searchNum ){
                found = true;
                break;
            }

        } if (found){
            System.out.println(searchNum + " is in the list");
        } else{
            System.out.println(searchNum + " is NOT in the list");
        }
    }

    public static void main(String[] args) {
        isArrayContainsNumbers();
    }
}
