package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String fullSentence = scanner.nextLine();
        scanner.close();
        String message = "";
        int firstEmptySpace = fullSentence.indexOf(" ");

        if (firstEmptySpace != -1){
            String firstWord = fullSentence.substring(0, firstEmptySpace);
            String cutSentence = fullSentence.substring(firstEmptySpace +1);
            String resultVersion = cutSentence + " " + firstWord;
            message = resultVersion;

        } else {
            message = "Your entry does not consist of multiple words...";
        }
        System.out.println(message);

    }
}

