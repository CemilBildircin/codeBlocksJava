package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Objects;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month:\t");
        String month = scanner.next();

        String january = "january";
        String february = "february";
        String march = "march";
        String april = "april";
        String may = "may";
        String june = "june";
        String july = "july";
        String august = "august";
        String september = "september";
        String october = "october";
        String november = "november";
        String december = "december";

        if (Objects.equals(month, january)){
            System.out.println("There are 31 days in January");
        } else if (Objects.equals(month, february)) {
            System.out.println("There are 28 days in February (29 days in every leap year)");
        } else if (Objects.equals(month, march)) {
            System.out.println("There are 31 days in March");
        } else if (Objects.equals(month, april)) {
            System.out.println("There are 30 days in April");
        } else if (Objects.equals(month, may )) {
            System.out.println("There are 31 days in May");
        } else if (Objects.equals(month, june)) {
            System.out.println("There are 30 days in June");
        } else if (Objects.equals(month, july)) {
            System.out.println("There are 31 days in July");
        } else if (Objects.equals(month, august)) {
            System.out.println("There are 31 days in August");
        } else if (Objects.equals(month, september)) {
            System.out.println("There are 30 days in September");
        } else if (Objects.equals(month, october)) {
            System.out.println("There are 31 days in October");
        } else if (Objects.equals(month, november)) {
            System.out.println("There are 30 days in November");
        } else if (Objects.equals(month, december)) {
            System.out.println("There are 31 days in December");
        }


//        Write a program that can find the number of days in a month
//                (Assume that Feb has 28 days) The month can be represented by a number
//
//        28 days: 2
//        30 days: 4,6,9,11
//        31 days: 1,3,5,7,8,10,12
//
//        Challenge: Recreate the program to work with String inputs of the month names


    }

}
