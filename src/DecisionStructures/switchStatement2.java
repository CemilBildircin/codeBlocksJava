package DecisionStructures;

import java.util.Scanner;

public class switchStatement2 {
    public static void main(String [] args){

        char choice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Y or N\t");
        choice = scanner.next().charAt(0);

        switch (choice)
        {
            case 'Y':
            case 'y':
                System.out.println("You entered Y");
                break;
            case 'N':
            case 'n':
                System.out.println("You entered N");
                break;
            default:
                System.out.println("Incorrect Input !!!");
        }


    }
}
