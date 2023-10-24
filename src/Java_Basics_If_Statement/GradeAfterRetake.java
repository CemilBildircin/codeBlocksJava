package Java_Basics_If_Statement;

import java.util.Scanner;

public class GradeAfterRetake {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write Your Score: ");
        double score1 = input.nextInt();
        System.out.print("Number of Attempt (1 to 3) : ");
        int attempt = input.nextInt();
        double firstAttempt = score1 - (score1 * 10 / 100 );
        double secondAttempt = score1 - (score1 * 20 / 100);
        double thirdAttempt = score1 - (score1 * 35 / 100);

        if (attempt == 1) {
            double firstScore = firstAttempt;
            System.out.println("Your Score is: " + firstScore + " at the 1st try." );
        } else if (attempt == 2){
            double secondScore = secondAttempt;
            System.out.println("Your Score is: " + secondScore + " at the 2nd try." );
        } else if (attempt == 3){
            double thirdScore = thirdAttempt;
            System.out.println("Your Score is: " + thirdScore + " at the 3rd try." );
        }

        }
}

