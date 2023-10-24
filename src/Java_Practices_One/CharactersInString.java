package Java_Practices_One;

public class CharactersInString {
    public static void main(String[] args) {
/*
Given a String print the ascii value codes for each character

                Ex:
                    Input:
                        “java”
                    Output:
                        1069711897
 */
        String str = "Java";
        int i;
        for (i = 0; i < str.length(); i++) {

            str.charAt(i);
            System.out.print((int) str.charAt(i) + " ");
        }
    }
}
