package Arrays;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania",
                "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};

        System.out.println("\nTask 1");
        for (int i = 0; i < countries.length; i++) {
            System.out.print(" " + countries[i].toUpperCase().charAt(0) +
                    countries[i].toUpperCase().charAt(countries[i].length() - 1));
        }

        System.out.println("\nTask 2");
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].endsWith("a")) {
                System.out.print(" " + countries[i]);
            }
        }
        boolean inThere = false;
        System.out.println("\nTask 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Country name: ");
        String check = scanner.next();

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase(check)) {
                inThere = true;
                break;
            }
        }
        if (inThere) {
            System.out.println(check + " is on the list...");
        } else {
            System.out.println(check + " is not on the list...");
        }
    }
}
