package Java_Basics_If_Else_If_ExamplesThree;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a webpage: ");
        String webPage = scanner.next();

        if (webPage.startsWith("www.")) {
            if (webPage.endsWith(".com") || webPage.endsWith(".edu") || webPage.endsWith(".gov") || webPage.endsWith(".net")) {
                System.out.println("\nUploading the page...");
            } else {
                System.out.println("Please enter a correct URL that ends with \".com, .edu, .gov, or .net\"");
            }
        } else {
            System.out.println("Please enter a correct URL that starts with \"www.\"");
        }
    }
}


