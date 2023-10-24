package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        int wordLength = word.length();
        int tempNum = (wordLength) / 2;

        if (wordLength % 2 == 0){
            System.out.println("Middle Characters are: " +  word.charAt(tempNum-1)+ word.charAt(tempNum));
        } else {
            System.out.println("Middle Character is: " + word.charAt(tempNum));
        }

    }
}
