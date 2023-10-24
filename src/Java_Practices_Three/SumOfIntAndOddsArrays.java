package Java_Practices_Three;

import java.util.*;

public class SumOfIntAndOddsArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        int[] oddNum = new int[num];
        int[] evenNum = new int[num];
        int sumOfOdd= 0;
        int sumOfEven= 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter numbers: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenNum[i] = numbers[i];
            } else{
                oddNum[i] = numbers[i]; ;
            }
        }
        for (int i = 0; i < oddNum.length; i++) {
            sumOfOdd += oddNum[i];
        }
        for (int i = 0; i < evenNum.length; i++) {
            sumOfEven += evenNum[i];
        }
        System.out.println(" Sum of Odd Numbers: " + sumOfOdd + " and Sum of Even Numbers: " + sumOfEven);

    }

}
/*

System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Number 4: ");
        int num4 = scanner.nextInt();
        System.out.print("Number 5: ");
        int num5 = scanner.nextInt();
 */