package Java_Basics_StringMethods_ExamplesOne;

import java.util.Scanner;

public class ReplaceProgram {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message here: ");
        String str1 = scanner.nextLine();
        System.out.println("Pick a combination\n\t'a' to 'e' --> 1\n\t's' to 'r' --> 2\n\t'o' to 'z' --> 3");
        int pickNum = scanner.nextInt();
        String message = "";
        scanner.close();

        if (pickNum == 1 && str1.contains("a")){
           message = str1.replace('a', 'e');
        } else if (pickNum == 2 && str1.contains("s")){
            message = str1.replace('s','r');
        } else if (pickNum == 3 && str1.contains("o")){
            message = str1.replace('o','z');
        } else{
            message = "Sentence does not contain any of the letters or invalid number selected...\nPlease try again...";
        }
        System.out.println(message);
    }
}
/* or we can use this code as well...simple and does not contain any extra condition.

         if (pickNum == 1){
         message = str1.replace('a', 'e');
         } else if (pickNum == 2){
         message = str1.replace('s','r');
         } else{
         message = str1.replace('o','z');
         }
         System.out.println(message);
 */