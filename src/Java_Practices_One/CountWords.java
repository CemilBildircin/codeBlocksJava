package Java_Practices_One;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String str1 = scanner.next();
        System.out.print("Enter Lastname: ");
        String str2 = scanner.next();

        String first = "";
        String last = "";

        if (str1.length() >= 6 && str2.length() >= 6) {
            first = str1.substring(0, 4);
            last = str2.substring(str2.length() - 3);
            System.out.println("Input: " + str1 + " " + str2);
            System.out.println("Output: " + first.toLowerCase() + last.toLowerCase() + "@loopcamp.io");
        } else {
            System.out.println("Invalid entry. Use at least 6 characters...");
        }
    }
}
 /*
Task:
     		Ask user to enter two strings.

    		Both strings should be at least 6 character long.
        		If they are shorter than that
            			print “Invalid data” and program should end.
        		If the information provided is valid,
            			you will take the first 4 characters of first string and combine them with the last three characters of the second string.

        		At the end of your combined string
            			add “@loopcamp.io” and print the final string as your created email.

        		The final email should be in all lowercase.

        		input: JamesBond Secret
        		output: jameret@loopcamp.io




  */