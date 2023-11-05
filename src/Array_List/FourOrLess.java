package Array_List;

import java.util.*;
public class FourOrLess {

    public static void main(String[] args) {

        ArrayList<String> findFourOrLess = new ArrayList<>(Arrays.asList("apples", "tree", "loop",
                "cat", "animal", "shortcut", "Java", "html"));
        ArrayList<String> IFoundFour = new ArrayList<>();
        for (String string : findFourOrLess) {
            if (string.length() <= 4) {
                IFoundFour.add(string);
            }
        }
        System.out.println(IFoundFour);
    }
}
