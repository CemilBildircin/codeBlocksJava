package Java_Practices_Three;

import java.util.Scanner;

public class PowerOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();
        System.out.print("Power: ");
        int power = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println(result);


    }
}
