package Constructor;
import java.util.*;

public class UsingFood {
    public static void main(String[] args) {

        Food item1 = new Food("Pizza", 6, 3.99);
        Food item2 = new Food("Hamburger", 1, 5.99);
        Food item3 = new Food("Cheeseburger", 3, 5.99);
        Food item4 = new Food("Kebab", 2, 7.99);
        Food item5 = new Food("Amazing Kebab", 3, 7.99);

        ArrayList<Food> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));
      System.out.println(itemList);
        ArrayList<Food> foodStartsWithA = new ArrayList<>();
        ArrayList<Food> expensiveFood = new ArrayList<>();
        for (Food each : itemList) {
            if (each.name.toLowerCase().charAt(0) == 'a') {
                foodStartsWithA.add(each);
            }

            if (each.totalPrice > 20){
                expensiveFood.add(each);
            }

        }
        System.out.println("Food Starts With 'a' = " + foodStartsWithA);
        System.out.println();
        System.out.println("Expensive Food = " + expensiveFood);

    }
}
