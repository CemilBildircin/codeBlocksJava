package Java_Practices_Three;

import java.util.Scanner;

public class PowerOfAnother {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base;
        int power;
        int result = 1;
        System.out.print("Enter base value: ");
        base = input.nextInt();
        System.out.print("Enter power value: ");
        power = input.nextInt();
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(power + " times " + base + " = " + result);
    }
}
