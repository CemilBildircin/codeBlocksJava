package Arrays;

import java.util.*;

public class MultipleWords {
    public static void main(String[] args) {

        String things = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arr = things.split(", ");
        //System.out.println(Arrays.toString(arr));
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(" ")) {
                result += arr[i]+"\n";
            }
        }
        System.out.print(result);


    }
}
