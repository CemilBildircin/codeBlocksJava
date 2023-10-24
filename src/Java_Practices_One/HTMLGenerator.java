package Java_Practices_One;

public class HTMLGenerator {
    public static void main(String[] args) {

        String str = "Juli^3";
        int num = Integer.parseInt(str.substring(str.length() - 1));
        String result = str.substring(0, str.length() - 2);
        for (int i = 0; i < num; i++) {
            System.out.print("<" + result + ">" + "</" + result + ">");

        }
    }
}
/*
Given a String in the following format take the number part of the generator the html tags

                    Ex:
                        Input:
                            div^2
                        Output:
                            <div></div><div></div>
                    Ex:
                        Input:
                            li^3
                        Output:
                            <li></li><li></li><li></li>
                            // int xxx = integer.parseInt(string_var_name);  //Convert String num to integer num.

 */