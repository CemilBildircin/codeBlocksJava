package Inheritance;

public class AllClassesEmployee {
    public static void main(String[] args) {

        Employer employerFirst = new Employer();
        Tester testerFirst = new Tester();
        Tester testerSecond = new Tester();
        Developer developerFirst = new Developer();

        employerFirst.name = "SpaceX";
        employerFirst.isFullTime = true;
        employerFirst.salary = 123_000;
        System.out.println(employerFirst);
        System.out.println();

        testerFirst.name = "Ujuju ";
        testerSecond.name = "Caglar ";
        developerFirst.name = "Chad ";
        testerFirst.print("Ujuju");
        developerFirst.develop(true);
        testerFirst.test(true);
        System.out.print(testerSecond.name);
        testerSecond.test(false);
        System.out.print(developerFirst.name);
        developerFirst.develop(true);
        System.out.print(testerSecond.name);
        testerSecond.test(true);
        System.out.print(testerFirst.name);
        testerFirst.test(false);

    }
}
