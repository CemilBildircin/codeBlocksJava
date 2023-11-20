package Encapsulation;

public class CallingFLightTicket {
    public static void main(String[] args) {

       FlightTicket ticketOne = new FlightTicket("first class",
                "Atlanta",
                 "Adana");
       ticketOne.setFlightType("business");
       ticketOne.setArrLocation("Istanbul");
       System.out.println(ticketOne);
    }
}
