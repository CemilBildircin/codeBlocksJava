package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int season = scanner.nextInt();

        switch (season){

            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.print("Invalid month number");
        }
    }
}
//    Given some month number determine which season it is
//
//        Winter: 12,1,2
//        Spring: 3,4,5
//        Summer: 6,7,8
//        Fall:   9,10,11
//
//        Ex:
//        when month = 2;
//        OUTPUT:
//        "Winter"
//
//        when month = 7;
//        OUTPUT:
//        "Summer"