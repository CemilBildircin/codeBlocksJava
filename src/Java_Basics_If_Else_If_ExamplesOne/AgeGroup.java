package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age;\t");
        int age = scan.nextInt();

        if (age <= 1 && age != 0) {
                System.out.println("This is Infant age group");
        }else if (age >=120){
                System.out.println("Invalid Entry...");
        }else if (age >= 3 && age <= 5){
            System.out.println("This is Toddler age group");
        } else if (age >= 6 && age <= 9) {
            System.out.println("This is Kid age group");
        } else if (age >= 10 && age<= 12) {
            System.out.println("This is Pre-Teen age group");
        } else if (age >= 13 && age <= 17) {
            System.out.println("This is Teenager age group");
        } else if (age >= 18 && age <= 20) {
            System.out.println("This is Young Adult age group");
        } else if (age >= 21 && age <= 35) {
            System.out.println("This is Adult age group");
        } else if (age >= 36 && age < 55) {
            System.out.println("This is Middle-Aged Adult age group");
        } else if (age >= 55 ) {
            System.out.println("This is Senior Citizen age group");
        } else if (age == 0) {
            System.out.println("Invalid Entry...");
        }

    }
}
//    Write a program that can define the age groups of someone based on their given age:
//
//        infant (< 1 year)
//        Toddler (3 - 5)
//        Kid (6 - 9
//        Pre-Teen (10 - 12)
//        Teenager (13 - 17)
//        Young Adult (18 - 20)
//        Adult (21 - 35)
//        Middle-Aged Adult (36 - 55)
//        Senior Citizen (55+)
//
//        Challenge: if age > 120 or less than 0 ==> invalid entry