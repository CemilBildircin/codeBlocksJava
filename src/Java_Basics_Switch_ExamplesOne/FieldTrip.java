package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Grade Level (1 to 6): ");
        int grade = scanner.nextInt();
        String message = "";

        switch (grade){
            case 1:
                message = "\nActivity: Long Boarding\nNumber of Groups: 5\nTeacher in Charge: Ms. Smith";
                break;
            case 2:
                message = "\nActivity: SCUBA Diving\nNumber of Groups: 4\nTeacher in Charge: Ms. Donald";
                break;
            case 3:
                message = "\nActivity: Surfing\nNumber of Groups: 3\nTeacher in Charge: Ms. Tatiana";
                break;
            case 4:
                message = "\nActivity: Rock Climbing\nNumber of Groups: 1\nTeacher in Charge: Ms. Stone";
                break;
            case 5:
                message = "\nActivity: Mountain Biking\nNumber of Groups: 2\nTeacher in Charge: Ms. Taylor";
                break;
            case 6:
                message = "\nActivity: Zip Lining\nNumber of Groups: 6\nTeacher in Charge: Ms. Long";
                break;
            default:
                System.out.println("\nPlease try again with a valid grade number...");
        }System.out.println(message);

        }
    }

