package Java_Nested_Loop;

public class CamelCases {

    public static void main(String[] args) {
        
        String str = "theOtherCharactersOfTheWordWillBeLowercase"; // 8 upper + first word
        int num = 0;

        for (int i = 0; i <str.length() ; i++) {

            if ( str.charAt(i) >= 65 && str.charAt(i) <= 90  ){
                num++;
            }
        }
        System.out.println(num);
    }
}