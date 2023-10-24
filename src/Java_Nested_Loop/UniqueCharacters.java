package Java_Nested_Loop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AAAGBBBCDDDHEERLTTTU";
        String list = " ";

        for (int i = 0; i < str.length(); i++) {
            if ( str.substring(0,i).equals(str.substring(0,i+1))) {

            }
            System.out.println(list);
        }
    }
}


/*

for (int i = 0; i < str.length(); i++) {
            if (!strNew.contains("" + str.charAt(i))) {
                strNew += str.charAt(i);
            }
        }
        System.out.println(strNew);
 */
