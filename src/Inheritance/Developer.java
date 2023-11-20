package Inheritance;

public class Developer extends Employer {

    boolean featuresCreated;

    public void develop(boolean featuresCreated){
        if (featuresCreated){
            System.out.println("Creating more features");
        } else{
            System.out.println("Does not create any thing");
        }
    }
}
