package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHow many minutes left: ");
        int minuteLeft = scanner.nextInt();
        String message = "";

        if(minuteLeft < 0 ){
            message = "Minutes can not be a negative number...";
        }
        if(minuteLeft >= 90){
            message = "Games can not be longer than 90 minutes...";
        }
        if (minuteLeft < 90 && minuteLeft >= 75){
            message = "Just getting started";
        }
        if (minuteLeft <= 74 && minuteLeft >= 60 ){
            message = "Players are doing their best";
        }
        if (minuteLeft <= 59 && minuteLeft >= 30){
            message = "Middle of the game is going great";
        }
        if (minuteLeft <= 29 && minuteLeft >= 0){
            message = "The end of the game is approaching";
        }
        System.out.println(message);
    }
}
