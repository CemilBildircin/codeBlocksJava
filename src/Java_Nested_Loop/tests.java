package Java_Nested_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tests {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}






