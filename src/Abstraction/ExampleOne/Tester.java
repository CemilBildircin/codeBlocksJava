package Abstraction.ExampleOne;

public class Tester extends Employee{

    @Override
    public void hobby() {
        super.hobby();
        System.out.println("Rock Climbing, Motorcycles");
    }

    @Override
    public void work() {

        System.out.println("Running the test cases");
    }

}
