package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first and last name of the 1st person: ");
        String person1 = scanner.nextLine();
        System.out.print("Enter first and last name of the 2nd person: ");
        String person2 = scanner.nextLine();


        if ( person1.substring(person1.indexOf(" ")+1).equals(person2.substring(person2.indexOf(" ")+1))){
            System.out.println(person1 + " and " + person2 + " are related");
        } else {
            System.out.println(person1 + " and " + person2 + " are NOT related");
        }

    }
}
