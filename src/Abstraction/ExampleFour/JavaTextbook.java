package Abstraction.ExampleFour;

public class JavaTextbook extends EBook{

    boolean isFun;

    @Override
    public void download() {
        System.out.println("Downloading a new Textbook");
    }

    @Override
    public void open() {
        System.out.println("Opening a new Textbook");
    }

    @Override
    public void read() {
        System.out.println("Reading the new Textbook");
    }

    @Override
    public String toString() {
        return "Java Textbook Details" +
                "\n\tFun: " + isFun +
                "\n\tSize: " + size +
                "\n\tName: " + name ;
    }
}
