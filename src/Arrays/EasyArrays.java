package Arrays;

import java.util.*;

public class EasyArrays {
    public static void main(String[] args) {
        String eachWords = "";
        String[] words = {"hello", "why", "by", "note"};
        for (int i = 0; i < words.length; i++) {
            eachWords = words[i] + " ";
            System.out.println(" " + eachWords.charAt(0) + eachWords.charAt(eachWords.length() - 2));

        }


    }
}
