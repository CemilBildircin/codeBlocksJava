package Java_Basics_If_Else_If_ExamplesOne;

import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        
        if (num <=100 && num >=85){
            System.out.println("A");
        } else if ( num <=84 && num >= 70) {
            System.out.println("B");
        } else if ( num <= 69 && num >= 55) {
            System.out.println("C");
        } else if ( num <= 54 && num >=40) {
            System.out.println("D");
        } else if (num <40) {
            System.out.println("F");
        } else{
            System.out.println("Invalid, No Grade...");
        }

    }
}
