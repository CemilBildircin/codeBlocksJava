package Array_List;

import java.util.ArrayList;

public class SeparateParts {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<String> specialChar = new ArrayList<>();
        ArrayList<String> upperCase = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char scan = str.charAt(i);
            if (Character.isUpperCase(scan)) {
                upperCase.add(String.valueOf(scan));
            } else if (Character.isDigit(scan)) {
                specialChar.add(String.valueOf(scan));
            } else {
                numbers.add(String.valueOf(scan));
            }
        }

        System.out.println("List 1: " + specialChar);
        System.out.println("List 2: " +upperCase);
        System.out.println("List 3: " +numbers);
    }
}
