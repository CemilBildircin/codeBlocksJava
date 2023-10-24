package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("How many people do you live with " + name + "?");
        int numOfPeople = scanner.nextInt();
        String message = "";

        if(numOfPeople <= 2 ){
            message = name + " lives with less than 2 people";
        } else if (numOfPeople >= 3 && numOfPeople <= 6) {
            message = name + " lives with 3 - 6 people";
        } else if (numOfPeople > 6) {
            message = name + " lives with more than 6 people";

        }System.out.print(message);

        System.out.println("\nWhat city do you live in? ");
        String cityLive = scanner.next();

        System.out.println("Are you living in downtown " + cityLive + "? (yes / no) ");
        String downTown = scanner.next();
        switch (downTown){
            case "y":
            case "Y":
            case "Yes":
            case "yes":
                System.out.println("Have you thought about moving to the suburbs?");
                String yesSuburbs = scanner.next();

                switch (yesSuburbs){
                    case "y":
                    case "Y":
                    case "Yes":
                    case "yes":
                        message = "Do it, it's great.";
                        break;
                    case "n":
                    case "N":
                    case "No":
                    case "no":
                        message = "You should think about it";

                }
                System.out.println(message);

        }

        System.out.println("What is your favorite animal ");
        String animal = scanner.next();
        System.out.println("Wow " + animal + " is a great animal" );
        System.out.println("How many " + animal + " do you want?");
        int numOfAnimal = scanner.nextInt();
        System.out.println("Interesting, " + "do you want " + numOfAnimal + " " + animal +"?" );
        System.out.println("\n\nThere was COVID-19");

    }
}
