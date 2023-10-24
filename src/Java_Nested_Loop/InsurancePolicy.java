package Java_Nested_Loop;

import java.util.Scanner;

public class InsurancePolicy {

    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Do you have a US driver license? Y or N: ");
        String driverLicense = scan.nextLine();
        switch (driverLicense) {
            case "Y":
            case "y":
                System.out.print("Enter your ZIP code");
                int zipCode = scan.nextInt();
                if (zipCode == 20910 || zipCode == 20740) {
                    premium += 60;
                } else if (zipCode == 22102 || zipCode == 22103) {
                    premium += 30;
                } else {
                    premium += 50;
                }
                System.out.print("Is this vehicle Owned, Financed, or Leased?");
                vehicleOwnership = scan.next().toLowerCase();
                if (vehicleOwnership.contains("owned")) {
                    premium += 10;
                } else {
                    premium += 20;
                }
                System.out.print("How is this vehicle primarily used? ");
                vehicleUsage = scan.next();
                if (vehicleUsage.contains("Business")) {
                    premium += 50;
                } else if (vehicleUsage.contains("Pleasure")) {
                    premium += 10;
                } else if (vehicleUsage.contains("Commute")) {
                    premium += 20;
                }
                System.out.print("How many days per week? ");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += (daysDrivenToWorkOrSchool * 5);

                System.out.print("How many miles? ");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool++;

                System.out.print("How old are you? ");
                int age = scan.nextInt();
                if (age > 16) {

                    if (age == 17) {
                        premium = premium * 20;
                    } else if (age >= 18 && age <= 21) {
                        premium = premium * 6;
                    } else if (age > 21 && age < 25) {
                        premium = premium * 2;
                    }
                    System.out.print("How many years of driving experience: ");
                    int experience = scan.nextInt();
                    if ( experience > 0 ){
                        premium = premium - (experience*5);

                        System.out.print("Have you had any accidents in the last 5 years? ");
                        String accidentAnswer= scan.next();
                        switch (accidentAnswer){
                            case "yes":
                            case "Yes":
                                System.out.print("How many? ");
                                accidentsAmount = scan.nextInt();
                                premium = premium+ (double) (20 * accidentsAmount) /100;
                            case "no":
                            case "No":

                                System.out.print( "Have you had insurance pst 12 months?" );
                                continuousInsurance = scan.next();
                                if (continuousInsurance.contains("No")){
                                    premium = premium*2;
                                } else {

                                    System.out.print("What is the highest level of education you have completed?");
                                    education = scan.next();
                                    if (education.contains("PhD") || education.contains("Bachelors") || education.contains("Masters")){
                                        premium = premium - (5*premium)/100;
                                    } else if (education.contains("Doctors")){
                                        premium = premium - (10*premium)/100;
                                    } else if (education.contains("Less than High School")){
                                        premium +=(5*premium)/100;
                                    }

                                    System.out.print( name + " here's your quote!" );
                                    System.out.println( "Start Your Policy Today For: " + premium );
                                    referenceNumber = "" + name.charAt(0) + name.charAt(1)+ age + name.charAt(name.length()-1 + name.charAt(name.length()-1))
                                            + zipCode + education ;
                                    System.out.println( "Reference number: " + referenceNumber.toUpperCase());


                                }

                        }



                    }else {
                        System.out.print("Invalid data!");
                    }

                } else {
                    System.out.print("Invalid data!");
                }


                break;
            case "N":
            case "n":
                System.out.println("Invalid Data!");

        }


    }
}
