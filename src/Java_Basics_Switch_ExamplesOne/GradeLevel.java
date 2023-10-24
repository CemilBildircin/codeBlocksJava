package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade level to see which school level someone is in: ");
        int grade = scanner.nextInt();

        if (grade >= 1 && grade <= 5){
            System.out.println("Elementary School");
        } else if (grade >= 6 && grade <= 8) {
            System.out.println("Middle school");
        } else if (grade >= 9 && grade <= 12) {
            System.out.println("High school");
        } else if (grade >= 13 && grade <= 16) {
            System.out.println("College");
        } else if (grade >= 17 && grade <= 18) {
            System.out.println("Grad School");
        } else {
            System.out.println("Invalid grade level given...");
        }


    }
}
//    Given a grade level (byte) determine and print which school level someone is in.
//
//        1-5: Elementary school
//        6-8: Middle school
//        9-12: High school
//        13-16: College
//        17-18: Grad School
//        Other: Invalid grade level given
//
//        Hint: You can use it else
//
//
//        Ex:
//        Enter a grade level to see which school level someone is in.
//        18
//
//        OUTPUT:
//        Grad School
