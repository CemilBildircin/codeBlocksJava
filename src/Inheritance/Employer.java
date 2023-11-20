package Inheritance;

public class Employer {
    String name;
    boolean isFullTime;
    double salary;
    public void print(String name){
        System.out.println( "\t"+name + " is working");
    }

    @Override
    public String toString() {
        return "\nEmployer Details" +
                "\n\tName: " + name +
                "\n\tFull Time: " + isFullTime +
                "\n\tSalary: $" + salary;
    }
}
