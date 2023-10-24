package Java_Practices_Two;

import java.util.Scanner;

public class SecondToHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours, minutes, seconds;
        System.out.print("\nEnter seconds: ");
        int inputSeconds = input.nextInt();

        hours = inputSeconds / 3600 ;
        int remainingHours = inputSeconds % 3600;
        minutes = remainingHours / 60;
        seconds = remainingHours % 60;
        System.out.println(hours + " hours," + minutes + " minutes," + " and " + seconds + " seconds" );
}
}

