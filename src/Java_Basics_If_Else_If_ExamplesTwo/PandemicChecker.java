package Java_Basics_If_Else_If_ExamplesTwo;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tEnter the year: ");
        int year = scanner.nextInt();

        String message = "";

        if (year >= 1346 && year <= 1353){
            message = "\tThe Black Death";
        } else if (year >= 1655 && year <= 1666 ) {
            message = "\tGreat Plague of London";
        } else if (year >= 1770 && year <= 1772) {
            message = "\tRussian plague";
        } else if (year >= 1889 && year <= 1890){
            message = "\tFlu pandemic";
        } else if (year == 1916) {
            message = "\tAmerican polio epidemic";
        } else if (year >= 1918 && year <= 1920 ) {
            message = "\tSpanish Flu";
        } else if (year >= 2009 && year <= 2010 ) {
            message = "\tH1N1 Swine Flu pandemic";
        } else if (year >= 2014 && year <= 2016) {
            message = "\tWest African Ebola epidemic";
        } else if (year >= 2020 && year <= 2022 ) {
            message = "\tCOVID-19";
        } else {
            message = "\tNo Pandemic";
        }
        System.out.println(message);
    }
}
