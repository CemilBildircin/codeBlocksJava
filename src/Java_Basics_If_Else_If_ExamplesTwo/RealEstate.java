package Java_Basics_If_Else_If_ExamplesTwo;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your budget: $ ");
        long customerBudget = scan.nextInt();
        String hills = """
                \nNeighborhood Name : Hills\s
                Average Price $80,000 - $100,000\s
                Rating: 4.0\s
                Gated: No\s
                Allow Pets: Yes""";

        String oaks = """
                \nNeighborhood Name : Oaks\s
                Average Price $55,000 - $75,000 \\nRating: 3.5
                Gated: No\s
                Allow Pets: Yes""";

        String highLand = """
                \nNeighborhood Name : Highland\s
                Average Price $120,000 - $150,000\s
                Rating: 4.5
                Gated: Yes\s
                Allow Pets: No\s""";

        String canyon = """
                \nNeighborhood Name : Canyon\s
                Average Price $160,000 - $201,000\s
                Rating: 4.8
                Gated: Yes\s
                Allow Pets: Yes\s""";


        if (customerBudget <= 0){
            System.out.print("That is not a valid budget...");
        } if (customerBudget > 300000){
            System.out.print("Too much money for this agency...");
        }
        if (customerBudget <=75000 && customerBudget >55000){
            System.out.println(oaks);
        } else if (customerBudget >=80000 && customerBudget <=100000 ){
            System.out.println(hills);
        } else if (customerBudget >=120000 && customerBudget <=150000){
            System.out.println(highLand);
        } else if (customerBudget >= 160000 && customerBudget <= 201000){
            System.out.println(canyon);
        } else {
            System.out.println("We do not have available house within the price range." +
                    "Please try different price range." );
        }


    }
}