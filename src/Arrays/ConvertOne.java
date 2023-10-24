package Arrays;

import java.util.*;

public class ConvertOne {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        char[] charArr = name.toCharArray();
        System.out.println( ""+ charArr[0] + charArr[charArr.length-1]  );

    }
}
