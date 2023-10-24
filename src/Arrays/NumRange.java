package Arrays;

import java.util.Arrays;

public class NumRange {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (j+1) + i*10;
            }
        }
        System.out.print(Arrays.deepToString(arr));
    }
}
