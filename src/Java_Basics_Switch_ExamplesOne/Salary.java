package Java_Basics_Switch_ExamplesOne;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter hourly rate $: ");
        int hourlyRate = scanner.nextInt();
        if (hourlyRate <= 0 ){
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
        System.out.print("\nEnter your weekly hours: ");
        int weeklyHour = scanner.nextInt();

        if (weeklyHour < 1 || weeklyHour > 65 ){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }
        System.out.print("\nEnter the number of weeks worked: ");
        int numOfWeeks = scanner.nextInt();
        if ( numOfWeeks < 1 || numOfWeeks > 52 ){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }
        long salary = hourlyRate * weeklyHour * numOfWeeks;
        System.out.println("\nSalary: $ " + salary);

        if (salary <= 0){
            System.out.println("\nTry again with correct inputs...");
        }
    }
}

/*
weeklyHours <= 0 || weeklyHours > 65
 Task:
    		Given the following information:
				hourly rate,
                              	weekly hours,
                                and number of weeks.
    		Check if all the inputs are valid and then calculate the salary.
        		-hourly rate cannot be negative or zero
            			-> If invalid print: Hourly Rate cannot be Negative or Zero
        		-weekly hours cannot be zero, negative or more than 65
            			-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
        		-number of weeks cannot be less than 1 and more than 52
            			-> If invalid print: Number of weeks cannot be less than 1 or greater than 52

        		Note: Equation: salary  =  hourly rate *  weekly hours * number of weeks

			Note: You need think of the cases the user put wrong input


        	Ex:
        		Enter hourly rate $:
            		65
			Enter your weekly hours:
			40
`			Enter the number of weeks worked:
			50
			Salary: $__

 */