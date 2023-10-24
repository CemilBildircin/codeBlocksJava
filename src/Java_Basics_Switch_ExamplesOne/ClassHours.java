package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class ClassHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String dayOfTheWeek = scanner.next();
        String message = "";
        switch (dayOfTheWeek){
            case "Monday":
            case "monday":
                message = "Mentor Hours";
                break;
            case "Tuesday":
            case "tuesday":
                message = "No Class";
                break;
            case "Wednesday":
            case "wednesday":
            case "Thursday":
            case "thursday":
            case "saturday":
            case "Saturday":
                message = "Java class";
                break;
            case "Sunday":
            case "sunday":
                message = "Soft Skills";
                break;
            default:
                message = "Invalid enter, try again...";

        }
        System.out.println(message);

    }
}
/*

Given some Day(String) print out the office hours schedule for that day if there is office hours.
        		Monday:
            			Print: Mentor Hours
        		Tuesday:
			Friday:
				Print: No Class
			Wednesday:
			Thursday:
			Saturday:
            			Print: Java Class
        		Sunday:
				Print: Soft skills
        		Any other String:
            			Print: Invalid day given


			Note: You need think of the cases the user put wrong input


        	Ex:
        		Enter the day of the week:
            		Wednesday

            		OUTPUT:
				Java Class
 */