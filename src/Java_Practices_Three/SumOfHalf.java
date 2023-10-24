package Java_Practices_Three;

import java.util.Scanner;

public class SumOfHalf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Loop number: ");
        int num = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= num; i++) {

            result = 1 + (1.0 / i);
        }
        System.out.println(result);
    }

}
