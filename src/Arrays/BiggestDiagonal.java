package Arrays;

public class BiggestDiagonal {
    public static void main(String[] args) {

        int[] a = {3, 5, 1};
        int[] b = {1, 6, 10};
        int[] c = {5, 21, 10};
        int aBiggest = 0;
        int bBiggest = 0;
        int cBiggest = 0;

        if (a[0] + b[1] + c[2] > a[2] + b[1] + c[0]) {
            System.out.println("" + a[0]+"," + b[1]+"," + c[2]);
        } else if (a[2] + b[1] + c[0] > a[0] + b[1] + c[2]) {
            System.out.println("" + a[2]+"," + b[1]+"," + c[0]);
        }


    }
}
