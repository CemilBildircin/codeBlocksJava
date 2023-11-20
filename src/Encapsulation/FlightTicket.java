package Encapsulation;
public class FlightTicket {
    private String flightType, depLocation, arrLocation;
    public FlightTicket(String flightType, String depLocation, String arrLocation) {
        setFlightType(flightType);
        setArrLocation(arrLocation);
        setDepLocation(depLocation);
    }
    public void setFlightType(String flightType) {
        if (flightType.equalsIgnoreCase("first class") ||
               flightType.equalsIgnoreCase("business") ||
                flightType.equalsIgnoreCase("economy")) {
            this.flightType = flightType;
        } else {
            System.err.println("Invalid Flight Type...");
            System.exit(0);
        }
    }
    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }
    public void setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
    }
    @Override
    public String toString() {
        return "\nFlight Ticket Details" +
                "\n\tFlight Type: " + flightType +
                "\n\tDeparture Location: " + depLocation +
                "\n\tArrival Location: " + arrLocation;
    }
}
