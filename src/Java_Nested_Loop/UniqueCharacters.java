package Java_Nested_Loop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "Caglar";
        String dupChars = "";

        for (int i = 0; i < str.length() ; i++) {
            if (((str.substring(0,i)) + str.substring(i+1)).contains(""+str.charAt(i))) {
                dupChars += str.charAt(i);
//                str = str.replaceAll(""+str.charAt(i), "");
            }
        }

        System.out.println(dupChars);
    }
}


/*

for (int i = 0; i < str.length(); i++) {
            if (!strNew.contains("" + str.charAt(i))) {
                strNew += str.charAt(i);
            }
        }
        System.out.println(strNew);
         if ( str.substring(0,i).equals(str.substring(0,i+1))) {
                list += str.charAt(i);

 */
