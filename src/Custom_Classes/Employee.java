package Custom_Classes;

public class Employee {
    String name, id, jobTitle;
    int salary;

    public Employee(String name, String jobTitle) {

        this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee(String name, String id, String jobTitle,
                    int salary) {

        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(name + " is going to a meeting...");
    }

    @Override
    public String toString() {
        return "Employee Information" +
                "\nName: " + name +
                "\nID: " + id +
                "\nJobTitle: " + jobTitle +
                "\nSalary: $ " + salary;
    }
}
