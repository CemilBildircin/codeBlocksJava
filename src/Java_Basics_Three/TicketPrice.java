package Java_Basics_Three;

public class TicketPrice {
    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "Virginia";
        double baseTicketPrice = 110.50, milesBetweenCities = 739.8;
        double ticketPrice = baseTicketPrice + (milesBetweenCities/10);
        System.out.println("\nThe ticket price from " + city1 + " to " + city2 + " is: $" + ticketPrice);

    }
}
