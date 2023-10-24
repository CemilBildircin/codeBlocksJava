package Java_Basics_If_Else_If_ExamplesThree;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        if (message.contains("java is bad")) {
            System.out.println("message failed to send...\nCheck your entry...");
        }
        if (message.contains("quit")) {
            System.out.println("message failed to send...\nCheck your entry...");
        }
        if (message.contains("have fun")) {
            System.out.println("message failed to send...\nCheck your entry...");
        }
        if (message.contains("crying")) {
            System.out.println("Message failed to send...\nCheck your entry...");
        } else {
        System.out.println("Your message has been send.");
    }
  }
}
