package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of the house to see the max allowed occupants number: ");
        String type = scanner.next();

        String message = "";
        switch (type){

            case "Tree House":
            case "tree house":
                message = "There are only 1 people in the tree house";
                break;
            case "Mobile Home":
            case "mobile home":
                message = "There are 2 people in the mobile home";
                break;
            case "Apartment":
            case "apartment":
                message = "There are 4 people in the apartment";
                break;
            case "Town House":
            case "town house":
                message = "There are 6 people in the Town house";
                break;
            case "Villa":
            case "villa":
                message = "There are 8 people in the villa";
                break;
            case "Mansion":
            case "mansion":
                message = "There are 10 people in the mansion";
                break;
            default:
                System.out.println("Unknown input...");
                break;

        }
        System.out.println(message);
    }
}

//    Given a house type (String) print out the number of max occupants (int)
//
//        Tree house: 1
//        Mobile home: 2
//        Apartment: 4
//        Town house: 6
//        Villa: 8
//        Mansion: 10
//
//        -> Try to use variables instead of printing multiple times
//
//        Hint: You can use switch
////
//        Ex:
//        Enter the type of the house to see the max allowed occupants number.
//        Town house
//
//        OUTPUT:
//        There are 6 people in the Town house