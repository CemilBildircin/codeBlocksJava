package Java_Basics_One;

public class ConcatenationExampleFour {
    public static void main(String[] args) {

        String firstName = "Chris";
        String lastName = "Benjonden";
        String companyName = "High Works";
        double salary = 125000.0;
        String startDay = "20";
        String startMonth = "12";
        String startYear = "2023";
        boolean fullTime = true;
        String jobTitle = "Software Developer";
        String officeAddress = "1600 Amphitheatre Parkway, Mountain View, CA,";

        String fullName = firstName + " " + lastName;
        String startDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@highworks.com";
        double salaryAfter3Years = salary + 26000.0 + 26000.0;

        System.out.println("Employee Information:" + "\n" + "Full Name:" + "\t\t\t\t" + fullName + "\n" + "Start Date:" +
                "\t\t\t\t" + startDate + "\n" + "E-mail:" + "\t\t\t\t\t" + email + "\n" + "Salary After 3 Years:" + "\t$" +
                salaryAfter3Years );

    }
}
