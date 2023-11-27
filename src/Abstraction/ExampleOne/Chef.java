package Abstraction.ExampleOne;

public class Chef extends Employee {

    @Override
    public void hobby() {

        System.out.println("Trying new food");
    }

    @Override
    public void work() {

        System.out.println("Cooking three course meal");
    }
}
