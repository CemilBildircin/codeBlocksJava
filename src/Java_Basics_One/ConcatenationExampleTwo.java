package Java_Basics_One;

public class ConcatenationExampleTwo {
    public static void main(String [] args){

        int year = 1491;
        String whatHappened = "COLUMBUS SAILED THE OCEANBLUE.";
        String when = "\n" + "In" + " " + ++year;
        System.out.println( when + " " + whatHappened );

    }
}
