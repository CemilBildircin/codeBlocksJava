package Java_Basics_If_Statement;

import java.util.Scanner;

public class TimeInDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What time is it now? (0 to 24): ");
        byte hour1 = input.nextByte();

        if (hour1 < 12 ){System.out.println("Good Morning");
        }
        if (hour1 >= 12 && hour1 < 15 ){System.out.println("Good Afternoon");
        }
        if (hour1 >= 15 && hour1 <=24 ){System.out.println("Good Evening");
        }
        if (hour1 < 0 || hour1 > 24 ){System.out.println("Invalid Input. Try Again...");
        }
    }
}
