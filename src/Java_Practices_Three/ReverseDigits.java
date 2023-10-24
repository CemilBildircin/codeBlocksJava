package Java_Practices_Three;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int remainder = 0;
        int temp = num;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp /= 10;
        }
        System.out.println(reverse);

    }
}
