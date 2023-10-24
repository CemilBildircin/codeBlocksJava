package Java_Practices_Three;

public class PalindromeNum {
    public static void main(String[] args) {

        int x = 676;
        int hundreds = x / 100;
        int temp = x % 100; //tens and ones
        int tens = temp / 10;
        int ones = temp % 10;

        if (hundreds == ones) {
            System.out.print(true + ", " + x + " is Palindrome");
        } else {
            System.out.print(false + ", " + x + " is NOT a Palindrome");
        }

    }
}
