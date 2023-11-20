package InheritanceTwo;

public class CheckSeason {
    public static void main(String[] args) {


        Winter winter1 = new Winter("Alaska", 55,
                10);
        System.out.println(winter1);
        winter1.activity();

        Summer summer1 = new Summer("Arizona", 135,
                70);
        System.out.println(summer1);
        summer1.activity();

        Fall fall1 = new Fall("Atlanta", 60,
                40);
        System.out.println(fall1);
        fall1.activity();

        Spring spring1 = new Spring("Washington", 70,
                60);
        System.out.println(spring1);
        spring1.activity();


    }
}