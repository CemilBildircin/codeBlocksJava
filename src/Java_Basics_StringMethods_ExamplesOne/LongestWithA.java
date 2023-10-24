package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String word1 = scanner.next().toLowerCase();
        System.out.print("Enter your second word: ");
        String word2 = scanner.next().toLowerCase();
        System.out.print("Enter your first word: ");
        String word3 = scanner.next().toLowerCase();

        String message = "";

        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();
        int wordThreeLength = word3.length();

        if (!word1.contains("a")){
            word1 = "";
            wordOneLength = 0;
        }
        if (!word2.contains("a")){
            word2 = "";
            wordTwoLength = 0;
        }
        if (!word3.contains("a")){
            word3 = "";
            wordThreeLength = 0;
        }

        if (wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength ){
            message = "Longest word with 'a' is: " + word1;
        } else if (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength){
            message = "Longest word with 'a' is: " + word2;
        } else {
            message = "Longest word with 'a' is: " + word3;
        }

        System.out.println(message);
    }
}
