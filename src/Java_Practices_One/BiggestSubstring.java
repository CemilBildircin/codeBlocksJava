package Java_Practices_One;

public class BiggestSubstring {
    public static void main(String[] args) {

        /*
        Biggest substring of matching characters

                    Given a String find the biggest substring of chars that match and print it.

                    Ex: aaabbbcccccddddee
                    Output: ccccc
         */

        String s = "aaabbbcccccdddddddddeeeeee";
        String strEmpty = "";
        String biggest = "";

        for (int i = 0; i < s.length() - 1; i++) {
            strEmpty += s.charAt(i);
            if (s.charAt(i) != s.charAt(i + 1)) {  // when the character of i is different from the character next to it (i + 1)
                if (strEmpty.length() > biggest.length()) {
                    biggest = strEmpty; // assigns the substring as the new biggest
                }
                strEmpty = ""; // resets this String for the next substring
            }
        }
        System.out.println(biggest);
    }
}
