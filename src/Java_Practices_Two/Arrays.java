package Java_Practices_Two;

public class Arrays {
    public static void main(String [] args){
        int[] arr;

        arr = new int[10];
//        System.out.println(arr[0]);
//        System.out.println(arr1.length);

        double[] arr1= new double[10];
//        System.out.println(arr1.length);
//        System.out.println(arr1[0]);

        boolean[] arr2 = new boolean[10];
//        System.out.println(arr2[0]);

        int[] arr3 = {7,6,5,4,3,2,1,0};
//        System.out.println(arr3);

        int[][] matrix = {
                {1,2,3,4,5,},
                {5,4,3,2,1,}
        };
//        System.out.println(matrix[1][4]);

        int[][] matrix2 = new int [10][];
//        System.out.println(matrix2[0]);

        System.out.println(java.util.Arrays.toString(arr3));
        java.util.Arrays.sort(arr3);
        System.out.println(java.util.Arrays.toString(arr3));




    }
}
