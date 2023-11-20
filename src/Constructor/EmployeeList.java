package Constructor;

public class EmployeeList {

    String Id, position;
    int experience, salary;

    @Override
    public String toString() {
        return "\nEmployee List" +
                "\n\tId: " + Id +
                "\n\tPosition: " + position +
                "\n\tExperience: " + experience +
                "\n\tSalary: " + salary;
    }

    public EmployeeList(String ID,String position,
                        int experience,
                        int salary) {

        this.Id = ID;
        this.position = position;
        this.experience = experience;
        this.salary = salary;

    }
}
