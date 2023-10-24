package Java_Practices_One;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {

        /*  Count upper, lower, and numbers

        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.

                Ex:
        Input:
        2juMp41EEkd4s4
        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers

        */
        String str = "2juMpPOuyLK41EEkd4s4";
        int upCase = 0;
        int lowCase = 0;
        int num = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upCase++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowCase++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
        }
        System.out.println(upCase + " Uppercase letters " + "\n" + lowCase + " Lowercase letters" +
                "\n" + num + " Numbers");

    }
}
