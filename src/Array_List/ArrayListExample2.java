package Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<String> sHero = new ArrayList<>();

        sHero.add("Iron Man");
        sHero.add("Spider Man");
        sHero.add("Thor");
        sHero.add("Captain America");
        sHero.add("Hawkeye");
        sHero.remove(2);
        sHero.remove(0);
        sHero.remove(0);
        System.out.println(sHero);

    }

}
