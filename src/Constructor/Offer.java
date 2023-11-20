package Constructor;

public class Offer {

    String position, location;
    boolean isRemote, isLocal, isFullTime;
    int salary, dayPto;

    @Override
    public String toString() {
        return "\nOffer Details" +
                "\n\tPosition Name: " + position +
                "\n\tLocation: " + location +
                "\n\tRemote: " + isRemote +
                "\n\tLocal: " + isLocal +
                "\n\tFull Time: " + isFullTime +
                "\n\tSalary: $" + salary +
                "\n\tPTO: " + dayPto + " days";
    }

    public Offer(String position, String location,
                 boolean isRemote, boolean isLocal,
                 boolean isFullTime, int salary,
                 int dayPto) {

        this.position = position;
        this.location = location;
        this.salary = salary;
        this.isLocal = isLocal;
        this.isRemote = isRemote;
        this.isFullTime = isFullTime;
        this.dayPto = dayPto;


    }
}
