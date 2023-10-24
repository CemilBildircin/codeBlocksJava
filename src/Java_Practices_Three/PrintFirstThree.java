package Java_Practices_Three;

import java.util.Scanner;

public class PrintFirstThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Word: ");
        String str1 = scanner.next();
        System.out.print("How many repetition: ");
        int num = scanner.nextInt();

        if (str1.length() >= 3) {

            String result = str1.substring(0, 3);

            for (int i = 0; i < num; i++) {
                System.out.print(result);
            }
            System.out.print(" " + num);
        } else {
            System.out.println(str1 + " too short to repeat...");
        }
    }
}
