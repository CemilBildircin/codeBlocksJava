package Java_Practices_One;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mood: ");
        String mod = scanner.next();
        String message = "";
        switch (mod) {
            case "pink":
            case "Pink":
                message = " Mood: Happy\nBudget:$200";
                break;
            case "blue":
            case "Blue":
                message = " Mood: Relexed\nBudget: $150";
                break;
            case "orange":
            case "Orange":
                message = " Mood: Nervous\nBudget: $50";
                break;
            case "red":
            case "Red":
                message = " Mood: Angry\nBudget: $0";
                break;
        }
        System.out.println(message);
    }
}

/*

You have a mood ring and need to know what mood you are in based on the color.
The color will also provide a max budget value that is suggested for shopping

                        data:
                            pink:
                                mood: happy
                                budget: 200
                            blue:
                                mood: relaxed
                                budget: 150
                            orange:
                                mood: nervous
                                budget: 50
                            red:
                                mood: angry
                                budget: 0

 */