package Array_List;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {

        ArrayList <String> arrList1 = new ArrayList<>();
        arrList1.add("Hat");
        System.out.println("arrList1 = " + arrList1);
        arrList1.add("Shoes");
        System.out.println("arrList1 = " + arrList1);
        arrList1.add(1,"Jacket");
        System.out.println("arrList1 = " + arrList1);
        arrList1.add(0,"Towel");
        System.out.println("arrList1 = " + arrList1);
        arrList1.add(1,"Car");
        System.out.println("arrList1 = " + arrList1);

    }
}
