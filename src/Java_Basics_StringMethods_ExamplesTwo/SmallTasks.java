package Java_Basics_StringMethods_ExamplesTwo;

public class SmallTasks {

    public static void main(String[] args) {

        char upper = 'A';
        while (upper <= 'Z') {
            System.out.print(upper + " ");
            upper++;
        }
        System.out.println(" ");
        char lower = 'a';
        while (lower <= 'z') {
            System.out.print(lower + " ");
            lower++;
        }
        System.out.println(" ");
        char upperZ = 'Z';
        while (upperZ >= 'A') {
            System.out.print(upperZ + " ");
            upperZ--;
        }
        System.out.println(" ");
        char lowerAtoZ = 'z';
        while (lowerAtoZ >= 'a') {
            System.out.print(lowerAtoZ + " ");
            lowerAtoZ--;
        }
        System.out.println(" ");
        int num = 1;
        while (num <= 500) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println(" ");
        int num2 = 1;
        while (num2 <= 50) {
            if (num2 % 3 == 0 && num2 % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (num2 % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else if (num2 % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(num2 + " ");
            }
            num2++;
        }
    }
}
