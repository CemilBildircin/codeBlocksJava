package Arrays;

import java.util.Arrays;


public class Initials {
    public static void main(String[] args) {

        String[] friendList = {"James Bond", "Chris Sharma", "Ali Veli", "Java Softish"};

        for (int i = 0; i < friendList.length; i++) {

            friendList[i] = ("" + friendList[i].charAt(0) + friendList[i].charAt(friendList[i].indexOf(" ")+1));
        }

        System.out.println(Arrays.toString(friendList));
    }
}
/*

Ex:
Input:
 [ “James Bond”, “Eve Rell”, “Anna Johnson” ] Output:

Output:
 JB ER AJ

 */