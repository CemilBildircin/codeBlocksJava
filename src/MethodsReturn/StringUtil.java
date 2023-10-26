package MethodsReturn;

import java.util.*;


public class StringUtil {

    public static String stringFormatting(String str) {

        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }
    public static String camelCase(String word) {

        String result = "";
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                result += word.charAt(i);
            } else {
                result += word.substring(i + 1, i + 2).toUpperCase();
                i++;
            }
        }
        return result = result.replaceAll(" ", "");
    }

    public static int frequencyOfCharacter(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
    public static String uniqueCharacters(String str) {
        String uniLetters = "";
        for (int i = 0; i < str.length(); i++) {
           if ( frequencyOfCharacter(str, str.charAt(i)) == 1) {
               uniLetters += str.charAt(i);
           }
        }
        return uniLetters;
    }

    public static void main(String[] args) {
        System.out.println(stringFormatting("StRiNg"));
        System.out.println(camelCase("JaVa WilL RuLE THE WORld"));
        System.out.println(frequencyOfCharacter("banana",'a'));
        System.out.println(uniqueCharacters("Banana"));
    }
}