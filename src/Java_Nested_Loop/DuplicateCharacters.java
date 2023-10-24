package Java_Nested_Loop;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "AAABBBCCCDDDEE";
        String strNew = "";

        for (int i = 0; i < str.length(); i++) {
            if (!strNew.contains("" + str.charAt(i))) {
                strNew += str.charAt(i);
            }
        }
        System.out.println(strNew);
    }
}
