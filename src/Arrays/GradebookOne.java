package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GradebookOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students in the class: ");
        int count = scanner.nextInt();
        String[] students = new String[count];
        int[] score = new int[count];
        char[] grade = new char[count];
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Student Name " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
        for (int i = 0; i < count; i++) {
            System.out.print("Enter Score for student " + (i + 1) + " : ");
            score[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (score[i] >= 85) {
                grade[i] = 'A';
            } else if (score[i] >= 75) {
                grade[i] = 'B';
            } else if (score[i] >= 65) {
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i] + " -- " + "Score: " + score[i] + " -- " + "Grade: " + grade[i] + "\n# # # #");
        }


    }
}

