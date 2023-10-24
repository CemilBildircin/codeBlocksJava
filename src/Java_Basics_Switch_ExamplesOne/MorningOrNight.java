package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time (between 1 and 24 in whole numbers): ");
        int timeOfDay = scanner.nextInt();
        String message = "";

        if (timeOfDay <=11 && timeOfDay >=0 ) {
            message = "Morning";

        } else if (timeOfDay <=24 && timeOfDay >= 12) {
            message = "Afternoon";

        } else{
            message = "Incorrect input...";
        }
        System.out.println(message);

    }
}
/*
Task:
        Given some time value (int) in 24 hours format.
        Print if it's the morning or night.
        0 -11 : Morning
        12-24 : Night

        -> You can assume the value given is always valid (in the 24 hours range),
            but if you want a challenge use an if to control invalid values

        -> Try to use variables instead of printing multiple times

        Hint: You can use ternary if you can. If not, you if else or what you think is easier for you.


        Ex:
        Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:
        9

        OUTPUT:
        Morning

 */