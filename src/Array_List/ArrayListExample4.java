package Array_List;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        System.out.println(lowerCaseLetters());
    }

    public static ArrayList<String> lowerCaseLetters() {

        ArrayList<String> lowerCase = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            lowerCase.add(String.valueOf((char) i));
        }
        return lowerCase;
    }
}
