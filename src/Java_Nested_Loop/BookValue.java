package Java_Nested_Loop;

import java.util.Scanner;

public class BookValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input line: ");
        String str = scanner.nextLine().toLowerCase().trim();

             int $value = 0;

        for (int i = 0; i < str.length(); i++) {

            if ( str.contains("chapter")){
                $value += 10;
                str = str.replaceFirst("chapter","*");
            }
        }
        System.out.println($value);
    }
}
