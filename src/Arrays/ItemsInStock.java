package Arrays;
import java.util.*;

public class ItemsInStock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items: ");
        int itemNum = scanner.nextInt();
        String[] myArray = new String[itemNum];
        String[] itemList = {"jacket", "brush", "pants", "socks", "tv", "java", "apple", "banana", "water", "milk", "coke", "tomato"};
        String[] newItemList = new String[itemNum];
        boolean itemFound = false;
        scanner.nextLine();

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + " item: ");
            myArray[i] = scanner.nextLine();
            for (int i1 = 0; i1 < itemList.length; i1++) {
                if (myArray[i].equalsIgnoreCase(itemList[i1])) {
                    newItemList[i] = myArray[i];
                    itemFound = true;
                    break;
                }
            }
        if(!itemFound){
            System.out.println("We do not have it!");
        }
        }
        System.out.println("We do have: " + Arrays.toString(newItemList));
    }
}
