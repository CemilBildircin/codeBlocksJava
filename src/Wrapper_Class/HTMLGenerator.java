package Wrapper_Class;

public class HTMLGenerator {

    public static void main(String[] args) {

        htmlGenerator();
    }

    public static void htmlGenerator() {

        String str1 = "div^2";
        String strSub1 = str1.substring(0, str1.length() - 2);
        String num = str1.substring(str1.length() - 1);
        int nums = Integer.parseInt(num);
        for (int i = 0; i < nums; i++) {
            System.out.print("<" + strSub1 + ">" + "</" + strSub1 + "> ");
        }
    }
}
