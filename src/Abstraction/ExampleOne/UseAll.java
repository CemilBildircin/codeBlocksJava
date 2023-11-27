package Abstraction.ExampleOne;

public class UseAll {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.age = 35;
        tester1.jobTittle = "SDET";
        tester1.name = "Marcus";
        tester1.salary = 123000;
        System.out.println(tester1);
        tester1.work();
        tester1.hobby();

        System.out.println("-------");
        Chef chef1 = new Chef();
        chef1.name = "Agnus";
        chef1.age = 55;
        chef1.jobTittle = "Master Chef";
        chef1.salary = 234000;
        System.out.println(chef1);
        chef1.work();
        chef1.hobby();


    }


}
