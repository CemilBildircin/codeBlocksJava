package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:  ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5==0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 ) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 != 0 || num % 5 != 0){
            System.out.println(num);
        }

    }
}
//Task: Evaulate your number and print based on the following:
//        multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.
//        If the number is not disibile by any of those numbers print just the number
//
//        Example:
//
//        number = 5
//
//        "FizzBuzz" -> when number is divisible by 3 and  5
//        "Fizz" -> when number is divisible by 3
//        "Buzz" -> when number is divisible by 5