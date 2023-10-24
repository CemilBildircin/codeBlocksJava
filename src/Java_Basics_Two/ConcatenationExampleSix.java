package Java_Basics_Two;

public class ConcatenationExampleSix {
    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Bond";
        String gender = "Male";
        int age = 40;
        String companyName = "MI6";
        boolean areTheFullTime = true;
        String jobTitle = "Special Agent";
        long salary = 1_000_000L;
        int numberOfPTO = 15;
        boolean areTheyMarried = false;
        char suite = 'D';

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(areTheFullTime);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(numberOfPTO);
        System.out.println(areTheyMarried);
        System.out.println(suite);

        System.out.println(firstName + " " + lastName + " " + gender + " " + age + " " + companyName + " " +
                areTheFullTime + " " + jobTitle + " " + salary + " " + numberOfPTO + " " + areTheyMarried + " " + suite);

        System.out.println("\n" + "Employment information for " + firstName + " " + lastName + "\n" +
                "Gender:" + " " + gender + "\n" + jobTitle + " at " + companyName + "\n" +
                "Currently" + " " + age + " years old " + "\n" + companyName + " is located in suite " + suite + "\n" +
                "This years salary comes to $" + salary + "\n" + " Other Details: " + "\n" +
                "\t" + "PTO: 40" + "\n" + "\t" + "Full Time?" + " " + areTheFullTime + "\n" + "\t" + "Married? " + areTheyMarried);







    }
}
