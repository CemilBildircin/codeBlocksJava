package Arrays;

import java.util.*;
public class MultiplyArray {
    public static void main(String[] args) {

        int [][] arr1 = {{1,2,3},{1,2,3},{0,3,20}};
        int [][] arr2 = {{10,4,3},{5,2,7},{100,20,5}};
        int [][] arrNew = new int [3][3];

        for (int i = 0; i < arrNew.length; i++) {
            for (int i1 = 0; i1 < arrNew.length; i1++) {
                arrNew[i][i1] = arr1[i][i1] * arr2[i][i1];
            }
        }
        for ( int[] each : arrNew ){
            System.out.println(Arrays.toString(each));
        }
                

    }
}
