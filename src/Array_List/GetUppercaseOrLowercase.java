package Array_List;

import java.util.ArrayList;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {

        String str = "WhatIsWrongwiTHheLLoWorLd";
        ArrayList<String> lowerCase = new ArrayList<>();
        ArrayList<String> upperCase = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char lower = str.charAt(i);
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase.add(String.valueOf(lower));
            } else {
                upperCase.add(String.valueOf(lower));
            }
        }
        System.out.println("List 1: " + lowerCase);
        System.out.println("List 2: " + upperCase);
    }
}
