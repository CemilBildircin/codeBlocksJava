package Abstraction.ExampleOne;

public abstract class Employee extends Person {

    String jobTittle;
    double salary;

    public abstract void work();

    @Override
    public void hobby() {

    }

    @Override
    public String toString() {
        return "Employee Details" +
                "\n\tJob Tittle: " + jobTittle +
                "\n\tSalary: " + salary +
                "\n\tname: " + name +
                "\n\tAge: " + age;
    }
}
