package Java_Practices_One;

public class Triangle {
    public static void main(String[] args) {

        String str = "I WANT THIS POS";

        for (int i = 0; i < str.length()-6; i++) {

            for (int j = 0; j < str.length()-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(str.charAt(j));
            }

            for (int j = 0; j < str.length()-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
