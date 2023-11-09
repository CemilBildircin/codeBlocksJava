package Custom_Classes;
public class Offer {

    String location, company;
    int salary, numberOfPTO;
    boolean isFullTime;

    public Offer(String location, String company) {
        this.location = location;
        this.company = company;
    }
    public Offer(String company, String location, int salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public Offer ( String company, String location, int salary,
                    boolean isFullTime, int numberOfPTO ){
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString() {
        return "Offer Details" +
                "\nLocation: " + location +
                "\nCompany: " + company +
                "\nSalary: $" + salary +
                "\nFull Time: " + isFullTime +
                "\nPTO: " + numberOfPTO ;
    }
}
