package Java_Practices_Two;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int even = 20;
        for (int i = 1; i <= even; i++)
            if (i % 2 == 0)
               System.out.print(i + " ");
        System.out.println("\n+++++++++++++++++");
        int number=20;
        for (int i=1; i<=number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
        }
    }
}
