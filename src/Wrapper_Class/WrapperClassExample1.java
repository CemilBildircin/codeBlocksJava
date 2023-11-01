package Wrapper_Class;

public class WrapperClassExample1 {

    public static void main(String[] args) {
        System.out.println(isSameNumbers());
    }

    public static boolean isSameNumbers() {

        int upper = 0;
        int lower = 0;
        String str = "JAVAMANIAA softskills";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upper++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lower++;
            }
        }
        if (upper == lower) {
            return true;
        } else {
            return false;
        }
    }
}
