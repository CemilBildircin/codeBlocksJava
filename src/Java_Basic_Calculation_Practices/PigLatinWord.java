package Java_Basic_Calculation_Practices;

import java.util.Scanner;

public class PigLatinWord {
    public static void main(String[] args) {

        String englishWord, pigLatin;
        System.out.println("Write an English word: ");
        Scanner scanner = new Scanner(System.in);
        englishWord = scanner.next();
        pigLatin = englishWord.substring(2) + englishWord.charAt(1) + "ay";

        //beginIndex decides in which number (0,1,2,3, etc...) letter is the result will be start.
        // englishWord.charAt(1) --> decides which number (0,1,2,3, etc...) letter is going to add before our addition (+ay)
        // we can put whatever addition we want.

        System.out.println("\nEnglish word: " + englishWord);
        System.out.println("\nPig Latin Translation: " + pigLatin);

    }
}
