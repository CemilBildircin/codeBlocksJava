package Array_List;

import java.util.*;

public class HidePassword {

    public static void main(String[] args) {

        ArrayList<String> password = new ArrayList<>(Arrays.asList("hold", "my", "coffee"));
        String str = "";
        System.out.println(password);

        for (int i = 0; i < password.size(); i++) {
            str = password.get(i);

            for (int j = 0; j < str.length(); j++) {
                str = str.replace(str.charAt(j), '*');
            }
            password.set(i, str);
        }
        System.out.println(password);
    }
}
