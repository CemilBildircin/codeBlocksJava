//package Arrays;
//
//import java.util.*;
//
//public class LongestPalindrome {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String[] myArray = new String[3];
//        String palindrome = "";
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Word number " + (i + 1) + " ==> ");
//            myArray[i] = scanner.next().toLowerCase();
//        }
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i].length() == 3 && myArray[i].charAt(0) == myArray[i].charAt(2)) {
//                palindrome = myArray[i];
//                System.out.println(palindrome + " is a Palindrome");
//            } else if (   ){
//
//            }
//        }
//
//
//    }
//}
///*
//
//[IQ] Longest Palindrome
// Given a String array. Find the longest Palindrome String in your array.
//  Ex:
//   Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
//   Output: racecar
//     Ex:
//     Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
//     Output: No palindrome
// */