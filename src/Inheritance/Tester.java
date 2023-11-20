package Inheritance;

public class Tester extends Employer {

    boolean bugsFound;

    public void test(boolean bugsFound){

        if (bugsFound){
            System.out.println("Running the regression");
        } else {
            System.out.println("Does not run the regression");
        }

    }
}
