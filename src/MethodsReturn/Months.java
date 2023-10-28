package MethodsReturn;

import java.util.Scanner;

public class Months {

    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
            "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
        // loopIt("Months of the year");
//        loopIt("First Run");
//        loopIt("Second Run");
        String str1 = getInput("Enter first value: ");
        String str2 = getInput("Enter second value: ");
        String str3 = getInput("Enter third value: ");
        double result1 = add2Values(str1,str2);
        System.out.println("Result for two values : " + result1);
        double result2 = add3Values(str1,str2,str3);
        System.out.println("Result for tree values : " + result2);



    }

    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static double add2Values(String str1, String str2) {
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        return d1 + d2;
    }

    static double add3Values(String str1, String str2, String str3) {

        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        double d3 = Double.parseDouble(str3);
        return d1 + d2 + d3;


    }
}

