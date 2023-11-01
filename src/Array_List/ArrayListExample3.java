package Array_List;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {
        System.out.println(upperCaseLetters());
    }
    public static ArrayList<String> upperCaseLetters() {
        ArrayList<String> chars = new ArrayList<>();

        for (int i = 'A'; i <= 'Z'; i++) {
            chars.add(String.valueOf((char) i));
        }
        return chars;
    }

}