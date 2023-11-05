package Array_List;

import java.util.*;

public class TargetWord {
    public static void main(String[] args) {


        ArrayList<String> targetList = new ArrayList<>(Arrays.asList("Java", "html", "css", "java", "script", "selenium"));
        //target -->  java
        int counter = 0;
        for (String string : targetList) {
            if (string.equalsIgnoreCase("Java")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}